import java.util.ArrayList;
import java.util.List;

public class Scacchiera {
	List<Integer> griglia =null;
	final int dim;
	
	public Scacchiera(int dim) {
		super();
		this.griglia = new ArrayList<Integer>();
		this.dim = dim;
	}
	
	public Scacchiera(Scacchiera sc) {
		this.dim= sc.getDimension();
		this.griglia= new ArrayList<Integer>();
	}
	
	public List<Integer> getGriglia(){
		return griglia;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < dim; i++) {
			for (int j = 0 ; j < griglia.get(i); j++)
				sb.append(" - ");
			sb.append(" O ");
			
			for (int j = griglia.get(i) + 1; j < dim; j++)
				sb.append(" - ");
			sb.append("\n");
		}
		return sb.toString();
	}


	public int getDimension() {
	
		return dim;
	}

	public void add(int i) {
		griglia.add(i);
		
	}

	public void remove(int i) {
		griglia.remove(Integer.valueOf(i));
		
	}

	public boolean contains(int i) {
		
		return griglia.contains(i);
	}
	
	public boolean controllaDiagonale(int step) {

		for (int i = 0; i < step; i++) {
			if (step - i == Math.abs(griglia.get(step) - griglia.get(i)))
				return false;
		}

		return true;
	}
	
}
