package yasaves;//Juegos de Tanques

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.MemoryUtil;

public class VT {//Ventanas de Tanques
	
	private static long window;//la ventana
	
	public static void main(String[] args) {
		
		glInit();
		glloop();
		
	}
	
	public static void glInit() {
		
		glfwInit();//lo esencial
		glfwDefaultWindowHints();//establecer los valores predterminados
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);//que sea resizable
		
		int ANCHO = 1280;//:P
		int ALTO = 720;//tamaño de la ventana
		String TITLE = "E.G.A - Tanques";//nombre de la ventana
		
		window = glfwCreateWindow(ANCHO, ALTO, TITLE, MemoryUtil.NULL, MemoryUtil.NULL);//darle los valores a la ventana
		
		glfwMakeContextCurrent(window);//para que opengl lo tenga en cuenta
		glfwShowWindow(window);//para mostrar la ventana
		
		
		
		glfwSwapInterval(GL_TRUE);//para activar el opengl
		
	}
	
	public static void glloop() {//es el loop de opengl
		
		GLContext.createFromCurrent();//es esencial para que el loop funcione
		
		setInput(window);//el input
		
		while(glfwWindowShouldClose(window) == GL_FALSE) {//si la ventana sea cerrado o no necesita mantenimiento
			
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);//para limpiar el color y los dibujos,vertices,etc.
			glClearColor(0.0f, v, 0.0f, 0.0f);
			glfwPollEvents();//limpia los eventos
			
			glCreateQuad();//para crear un cuadrado o rectangulo
			
			glFlush();//mostar lo que le hemos mandado
			glfwSwapBuffers(window);
			
		}
		
	}
	
	public static void glCreateQuad() {
		
		glColor4f(0.1f, 1.0f, 0.2f, 1.0f);//lo que le da el color
		glBegin(GL_QUADS);//para crear el cubo
			glVertex2f(a, a2);//lados :D
			glVertex2f(-w, w2);//lados :D
			glVertex2f(-s, -s2);//lados :D
			glVertex2f(d, -d2);//lados :D
		glEnd();//para finalizar
	}
	
	static float w = 0.1f;
	static float a = 0.1f;
	static float d = 0.1f;
	static float s = 0.1f;
	static float w2 = 0.1f;
	static float a2 = 0.1f;
	static float d2 = 0.1f;
	static float s2 = 0.1f;
	static float v = 0.0f;
	
	public static void setInput(long W) {//metodo para que detecte cual tecla se presiona
		
		glfwSetKeyCallback(W, new GLFWKeyCallback(){//metodo para que detecte cual tecla se presiona

			@Override
			public void invoke(long W, int key, int scamcode, int action, int mods) {//permite saber si se a pulsado o no una tecla
				
				if(key == GLFW_KEY_Q && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					w = w + 0.1f;
					
					System.out.println(w);
				}
				
				if(key == GLFW_KEY_W && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					a = a + 0.1f;
					
					System.out.println(a);
				}
				
				if(key == GLFW_KEY_S && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					d = d + 0.1f;
					
					System.out.println(d);
				}
				
				if(key == GLFW_KEY_A && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					s = s + 0.1f;
					
					System.out.println(s);
				}
				
				if(key == GLFW_KEY_Y && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					w2 = w2 + 0.1f;
					
					System.out.println(w2);
				}
				
				if(key == GLFW_KEY_U && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					a2 = a2 + 0.1f;
					
					System.out.println(a2);
				}
				
				if(key == GLFW_KEY_J && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					d2 = d2 + 0.1f;
					
					System.out.println(d2);
				}
				
				if(key == GLFW_KEY_H && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					s2 = s2 + 0.1f;
					
					System.out.println(s2);
				}
				
				if(key == GLFW_KEY_V && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					v = v + 0.001f;
					
					System.out.println(v);
				}
				
				if(key == GLFW_KEY_B && action == GLFW_RELEASE) {//el metodo para cada tecla
					
					v = v + 0.0001f;
					
					System.out.println(v);
					
				}
				
			}
			
			
			
		});
		
	}
	
}
