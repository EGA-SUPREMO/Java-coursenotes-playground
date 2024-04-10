package yasaves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeguKajSkribu {
	
	public static void main(String[] args) {
		
		try {
			//FileOutputStream G = new FileOutputStream("G:/foto.jpg");
			FileOutputStream G = new FileOutputStream("/home/alejandro/Downloads/foto.tar.gz");
			long temp = System.nanoTime();
			long temp2;
			for(int gg:jo())
				G.write(gg);
			
			G.close();
			temp2 = System.nanoTime();
			
			System.out.println((double) (temp2 - temp) / (double) (1000000000));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	private static byte[] jo() {
		
		try {
			
			//FileInputStream f = new FileInputStream("hh.jpg");
			FileInputStream f = new FileInputStream("/home/alejandro/Downloads/eclipse-jee-neon-2-linux-gtk.tar.gz");
			BufferedInputStream b = new BufferedInputStream(f);
			byte h[] = new byte[13000000];
			
			
			try {
				
				for(byte i = 0; i < 25; i++)
					b.read(h);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			f.close();
			return h;
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	private static int[] j() {
		
		try {
			
			//FileInputStream f = new FileInputStream("hh.jpg");
			FileInputStream f = new FileInputStream("/home/alejandro/Downloads/eclipse-jee-neon-2-linux-gtk.tar.gz");
			System.out.println(new BufferedInputStream(f).available() / 25);
			int h[] = new int[new BufferedInputStream(f).available()];
			
			try {
				
				int byte_archivo = f.read();
				int i = 0;
				
				while(byte_archivo != -1) {
					
					h[i] = byte_archivo;
					byte_archivo = f.read();
					i++;
					
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			f.close();
			return h;
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	private static int[] kk(int jj) {
		
		int h[] = new int[jj];
		
		for(int i = 1; i<jj; i++)
			h[i] = (int)(32768 - Math.random()*65535);
		
		return h;
		
	}
}