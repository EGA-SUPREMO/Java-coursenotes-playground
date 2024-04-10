package yasaves;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFrame;

public class Arrays {

	public static void main(String[] args) {

		ArrayList<String> E_Radik = new ArrayList<>();

		E_Radik.add("akv");
		E_Radik.add("libr");
		E_Radik.add("viv");
		E_Radik.add("est");
		E_Radik.add("ost");
		E_Radik.add("vid");
		E_Radik.add("pro");
		E_Radik.add("ver");
		
		Iterator<String> it = E_Radik.iterator();
		
		String s;
		
		while(it.hasNext()) {
			
			s = it.next();
			
			System.out.println(s);
			
			if(s=="vid")
				it.remove();
			
		}
		
		for(int i = 0; i<E_Radik.size();i++) {
			
			System.out.println(E_Radik.get(i));
			
		}

		System.out.println(E_Radik.get(2));

		homo ale = new homo("Alejandro", 14, "Normala", 27083799);
		homo ale2 = new homo("Alejandro", 14, "Normala", 27083799);
		ale2.setAgx(25);
		if(!ale.equals(ale2)) {//Sciigu la metodo se objekto estas egala al alia objekto
			System.out.println(ale);
		} else if(ale.hashCode()==ale2.hashCode()) {
			System.out.println("tio ne estas bona afero");
		}
		
		LinkedList<String> llp = new LinkedList<>();
		
		llp.add("Argentina");
		llp.add("Mexiko");
		llp.add("Perú");
		llp.add("Venezuela");
		
		LinkedList<String> llcx = new LinkedList<>();
		
		llcx.add("Buenos Aires");
		llcx.add("D.F.");
		llcx.add("Lima");
		llcx.add("Distrito Capital");
		
		ListIterator<String> li = llp.listIterator();
		ListIterator<String> lli = llcx.listIterator();
		
		while(lli.hasNext()) {
			
			if(li.hasNext())
				li.next();
			
			li.add(lli.next());
			
		}
		
		System.out.println(llp);
		
		ListIterator<String> pp = llcx.listIterator();
		
		while(pp.hasNext()) {
			
			pp.next();
			
			if(pp.hasNext()) {
				
				pp.next();
				pp.remove();
				
			}
			
		}
		
		System.out.println(llcx);
		
		llp.removeAll(llcx);
		
		System.out.println(llp);
		
		TreeSet<String> vortj = new TreeSet<>();
		
		vortj.add("teo");
		vortj.add("isto");
		vortj.add("zebro");
		
		for(String i:vortj) 
			System.out.println(i);
		
		TreeSet<String> vortj2 = new TreeSet<>(new Comparator<String>() {//para derminar que se va a comparar
			
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		});
		
		vortj2.add("teo");
		vortj2.add("isto");
		vortj2.add("zebro");
		
		for(String i:vortj2) 
			System.out.println(i);
		
		HashMap<String, homo> i = new HashMap<>();
		
		i.put("a", new homo("Anno", 20, "normala"));
		i.put("b", new homo("Alno", 22, "duonnormala"));
		i.put("c", new homo("Almo", 23, "duonfelicxa"));
		i.put("d", null);
		i.put("e", new homo("Alpo", 39, "duonmalfelicxa"));
		
		System.out.println(i);
		
		i.remove("d");
		
		System.out.println(i);
		
		Set<Map.Entry<String, homo>> d = i.entrySet();
		Iterator<Entry<String, homo>> ii = d.iterator();
		//Iterator<Entry<String, homo>> ii = i.entrySet().iterator();
		
		while(ii.hasNext()) {
			
			Map.Entry<String, homo> ff = ii.next();
			
			System.out.println(ff.getKey());
			System.out.println(ff.setValue(ale));
			System.out.println(ff.getValue());
			
		}
		
		System.out.println();
		
		for(Map.Entry<String, homo> iii: i.entrySet()) {
			
			System.out.println(iii.getKey());
			System.out.println(iii.getValue());
			
		}
		
	}

}

class ff<E> {// primera clase génerica

	E hh;

	void CambiarTitulo(ff<? extends JFrame> k) {// Obliga a que todos los
												// objetos génericos que
												// invoquen a este método
												// hereden de JFrame
		@SuppressWarnings("unused")
		Object j = k;

	}

	static <U> void gh() {// Unua metodo génerico

	}

}

class homo {// Ordinara klaso

	@Override
	public int hashCode() {//Montras la lokon de la memorio kiu estis savita
		final int prime = 31;
		int result = 1;
		result = prime * result + CI;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		homo other = (homo) obj;
		if (CI != other.CI)
			return false;
		return true;
	}

	private String nom;
	private int agx;
	private String stat;
	private int CI;

	public homo(String nomo, int agxo, String stato) {

		nom = nomo;
		agx = agxo;
		stat = stato;

	}
	
	public homo(String nomo, int agxo, String stato, int CIo) {
		
		nom = nomo;
		agx = agxo;
		stat = stato;
		CI = CIo;
		
	}

	@Override
	public String toString() {
		return "homo [nom=" + nom + ", agx=" + agx + ", stat=" + stat + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAgx() {
		return agx;
	}

	public void setAgx(int agx) {
		this.agx = agx;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int CI) {
		this.CI = CI;
	}

}