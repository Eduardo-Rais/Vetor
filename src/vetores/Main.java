package vetores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vet2 vetor2 = new Vet2(2,1);
		Vet2 vetorb = new Vet2(-3,3);
		
		System.out.printf("%.2f\n" ,vetor2.tamanhoVetor());
		
		//vetor2.normalizaVetor();
		//vetor2.adicaoVetores(vetorb);
		Vet2 vetorC2 = vetor2.copiaVetor();
		
		vetor2.multiplicacaoEscalar(3);
		System.out.println("<"+vetor2.getX() + " " + vetor2.getY()+">");
		//vetor2.divisaoEscalar(3);
		
		System.out.println("<"+vetorC2.getX() + " " + vetorC2.getY()+">");
		System.out.println(vetor2.produtoEscalar(vetorb));
		
		float[] arrayC2 = vetorC2.vetorVetor();
		
		for(int i = 0; i<arrayC2.length; i++)
			System.out.println(arrayC2[i]);
	}

}
