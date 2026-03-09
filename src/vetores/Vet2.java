package vetores;

public class Vet2 {
	private float x, y;

	public Vet2() {
		this.x = 0;
		this.y = 0;
	}

	public Vet2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	
	public float tamanhoVetor() {
		float tamanho =0;
		
		tamanho = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		return tamanho;
	}
	
	public void normalizaVetor() {
		float tamanho =0;
		tamanho = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		this.x = x/tamanho;
		this.y = y/tamanho;
	}
	
	public void adicaoVetores(Vet2 vet) {
		this.x = x + vet.getX();
		this.y = y + vet.getY();
	}
	
	public void multiplicacaoEscalar(float n) {
		this.x = x*n;
		this.y = y*n;
	}
	
	public void divisaoEscalar(float n) {
		this.x = x/n;
		this.y = y/n;
	}
	
	public float produtoEscalar(Vet2 vetor) {
		float soma = 0;
		
		soma = (this.x * vetor.getX()) + (this.y * vetor.getY());
		
		return soma;
	}
	
	public Vet2 copiaVetor() {
		Vet2 copia = new Vet2(this.x, this.y);
		
		return copia;
	}
	
	public float[] vetorVetor() {
		float[] array = new float[2];
		
		array[0] = this.x;
		array[1] = this.y;
		
		return array;
	}
}
