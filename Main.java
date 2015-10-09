class Main{
	public static void main(String []argv)throws Exception{
		AnalizaFile file = new AnalizaFile("Texto.txt");
		System.out.println(file.getFirstLine() + "\n\n");
		
		file.setFileName("Animales.txt");
		System.out.println(file.getFirstLine() + "\n\n");
		
		file.creditos("Creditos.txt");
		
		file.writeName("Animales.txt","Tigre\nelefante\nRinoceronte");
	}
}