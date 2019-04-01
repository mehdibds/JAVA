public class TableauInt{
    private int [] tab=new int[10];

    public TableauInt(){
        for (int i=0; i<10; i++){
			tab[i]=(int)(Math.random()*101);
		}
    }
    public TableauInt(int n){
        for(int i=0;i<tab.length;i++){
            tab[i] = n + i;
        }
    }
    public String toString(){
        String string = "[";
        for(int i=0;i<tab.length;i++){
            if (i != tab.length -1){
                string = string + tab[i] + ",";
            }
            else{
                string = string + tab[i] + "]";
            }
        }
        return string;
    }
    public int rangMax(){
        if (tab.length == 0){
            return 0;
        }
        int mini = tab[0];
        for (int i=1;i<tab.length;i++){
            if (tab[i] > mini) {
                mini = tab[i];
            }
        }
        return mini;
    }
    public int Somme(){
        if (tab.length == 0){
            return 0;
        }
        int somme = tab[0];
        for(int i=1;i<tab.length;i++){
            somme+= tab[i];
        }
    return somme;
    }
    
    /*public boolean egal(TableauInt t){
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=t[i]){
                return false;
            }
        }
        return true;
    }
    */

}