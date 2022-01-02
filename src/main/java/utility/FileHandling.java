package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import entity.User;

public class FileHandling<T> {

	//String PATH = "D:\\Eclipse Java Projects\\New-Workspace\\BookStoreManagementSystem\\src\\main\\resources\\User.json";
	
	List<User> listUser;
	
	public FileHandling(List<User> listUser) {
		this.listUser = listUser;
	}

	public List<User> readUser() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("User.json"));
			Gson gson = new Gson();
			User[] jsonUser = gson.fromJson(br, User[].class);
			System.out.println(Arrays.asList(jsonUser));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUser;
	}
	
	public void writeUser(List<User> users) {
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(users);
		System.out.println(jsonStr);
		
		File file = new File("User.json");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created.");
			}else {
				System.out.println("File is exists.");
			}
			FileWriter fileWriter = new FileWriter(file);
			Gson gsonBulider = new GsonBuilder().setPrettyPrinting().create();
			JsonElement tree = gsonBulider.toJsonTree(users);
			gsonBulider.toJson(tree, fileWriter);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
