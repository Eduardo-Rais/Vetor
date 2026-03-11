package vetores;

public class Vet4 {
	private float x,y,z,w;

	//construtores
	public Vet4() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}

	public Vet4(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	//Getters e Setters
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
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	//Métodos
	public float tamanhoVetor() {
		
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + Math.pow(w, 2));
	}

	public void normalizaVetor() {
		float tamanho;
		tamanho = this.tamanhoVetor();
		
		this.x = x/tamanho;
		this.y = y/tamanho;
		this.z = z/tamanho;
		this.w = w/tamanho;
	}

	public void adicaoVetores(Vet4 vet) {
		this.x = x + vet.getX();
		this.y = y + vet.getY();
		this.z = z + vet.getZ();
		this.w = w + vet.getW();
	}

	public void multiplicacaoEscalar(float escalar) {
		this.x = x * escalar;
		this.y = y * escalar;
		this.z = z * escalar;
		this.w = w * escalar;
	}

	public void divisaoEscalar(float escalar) {
		this.x = x / escalar;
		this.y = y / escalar;
		this.z = z / escalar;
		this.w = w / escalar;
	}

	public float produtoEscalar(Vet4 vet) {
		float produto;
		produto = (x * vet.getX()) + (y * vet.getY()) + (z * vet.getZ()) + (w * vet.getW());
		
		return produto;
	}

	public Vet4 copiVet4(Vet4 vet) {
		Vet4 copia = new Vet4(this.x, this.y, this.z, this.w);
		
		return copia;
	}

	public float[] arrayVetor() {
		float[] array = new float[4];
		
		array[0] = this.x;
		array[1] = this.y;
		array[2] = this.z;
		array[3] = this.w;
		
		return array;
	}
	
}
