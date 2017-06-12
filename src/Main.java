import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Main");

	}
	
	short scale = 10; //Overall scale of game, tilesize
	int tiles[][] = new int[30][40];
	//TILES
	// 0 = nothing, 1 - 4 = mushroom [full, hit, hit, hit]
	int mushrooms = 0;
	
	//SETTINGS FUNCTION
	public void settings(){
		size(9*scale, 16*scale);	//size must be in settings outside of PDE //Aspect Ratio 9:16
	}
	
	public void setup(){
		makeMushrooms();
		
	}
	
	//populates mushrooms onstage
	public void makeMushrooms(){
		for(int i = 0; i < tiles.length; i++){
			for(int j = 0; j < tiles[i].length; j++){
				if (Math.random() < .1){
					tiles[i][j] = 1;
				}
			}
		}
	}
	
	public void draw(){
		for(int i = 0; i < tiles.length; i++){
			for(int j = 0; j < tiles[i].length; j++){
				switch (tiles[i][j]){
				case 0: 
				case 1: 
				case 2:
				case 3:
				case 4:
					rect(i*scale,j*scale,scale,scale);
				}
				
			}
		}
	}

}
