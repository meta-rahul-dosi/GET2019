package rough;

import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Rough {

	private JSONObject jo = new JSONObject(); // creating JSONObject

	Rough() throws FileNotFoundException {
		// putting data to JSONObject
		jo.put("tp", "topper");
		jo.put("ss", "Sunshine");
		jo.put("fi", "fiestel");

		// writing JSON to file:"JSONExample.json" in cwd
		PrintWriter pw = new PrintWriter(
				"C:\\eclipse-jee-luna-R-win32\\eclipse\\GET2019\\DSA\\Assignment-5\\Dictionary\\JSONExample.json");
		pw.write(jo.toJSONString());

		pw.close();
	}

	void add() {
		jo.put("ph", "philosophy");
		System.out.println(jo);
	}

	void delete() {
		jo.remove("tp");
		System.out.println(jo);
	}

	void getValue() {
		System.out.println(jo.get("ss"));
	}

	public static void main(String[] args) throws FileNotFoundException {

		Rough r = new Rough();

		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		Object object = null;

		try (FileReader reader = new FileReader(
				"C:\\eclipse-jee-luna-R-win32\\eclipse\\GET2019\\DSA\\Assignment-5\\Dictionary\\JSONExample.json")) {

			// Read JSON file
			object = jsonParser.parse(reader);

		} catch (Exception e) {
			System.out.println(e);
		}

		// typecasting obj to JSONObject
		JSONObject jsonObject = (JSONObject) object;

		r.add();
		r.delete();
		r.getValue();
	}
}
