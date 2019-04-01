public class TrianglePascal{
	int [][] tab;
	
	public TrianglePascal(int n){
		tab=new int[n][];
		for (int i=0;i<n; i++){
			tab[i]= new int[i+1];

		}
	}
	public  void remplirTriangle(){
		for (int i=0;i<tab.length; i++){
			for(int j=0; j<	tab[i].length;j++){
				if (j==0 || i==j)
					tab[i][j]=1;
				else 
					tab[i][j]= tab[i-1][j-1]+tab[i-1][j];
			}
		}
	}
	public String toString(){
		String string =new String("");
		for (int i=0;i<tab.length; i++){
			for(int j=0; j<	tab[i].length;j++){
				string+=tab[i][j]+"\t";
			}
			string+="\n";
		}
		return string;	
		
	}
}











