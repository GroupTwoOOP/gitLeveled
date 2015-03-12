package primary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {

	private static FileOutputStream create;
	private static FileInputStream load;
	public boolean fileCheck(String text) {
		File f = new File(text + ".txt");
		if(!f.exists()){
			try {
				create = new FileOutputStream(f);
				ObjectOutputStream output = new ObjectOutputStream(create);
				output.close();
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				load = new FileInputStream(f);
				ObjectInputStream output = new ObjectInputStream(load);
				output.close();
			} catch (FileNotFoundException e1) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public static void saveChunk(String name){
		File f = new File(name + ".sav");
		if(!f.exists()){
			try {
				create = new FileOutputStream(f);
				ObjectOutputStream output = new ObjectOutputStream(create);
				output.writeObject(new Chunk(TileManager.getTiles()));
				output.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else{
			
		}
	}
	public static Chunk loadChunk(String name){
		Object chunk = null;
		File f = new File(name + ".sav");
		if(f.exists()){
			try {
				load = new FileInputStream(f);
				System.out.println("load");
				ObjectInputStream input = new ObjectInputStream(load);
				System.out.println("input");
				chunk = input.readObject();
				System.out.println("import");
				input.close();
			}
			catch (Exception e){
				System.out.println("oops");
			}
		}
		else{
			System.out.println(name + ".txt does not exist.");
		}
		return (Chunk) chunk;
	}
}
