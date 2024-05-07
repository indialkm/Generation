package testeoptional;

import java.util.ArrayList;
import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> vetor =  new ArrayList<String>();
		
		vetor.add("Ingrid");
		vetor.add("Nero");
		vetor.add("Jacob");

		Optional<String> opcional = Optional.empty();
		Optional<String> opcional2 = Optional.of("Ingrid");
		Optional<Object> vetorOpi = Optional.of(vetor);
		
		System.out.print(vetorOpi);
		
		vetorOpi.get();
		
		
	}

}
