import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Main");

	}
	
	short scale = 10; //Overall scale of game, tilesize
	int tiles[][] = new int[30][40];		// 0 = nothing, 1 - 4 = mushroom [full, hit, hit, hit]
	int numMushrooms = 0;
	
	
	
	
	
	//SETTINGS FUNCTION
	public void settings(){
		size(tiles.length*scale, tiles[0].length*scale);	//size must be in settings outside of PDE //Aspect Ratio 9:16
	}
	
	public void setup(){
		makeMushrooms();
	}
	
	//populates mushrooms onstage
	public void makeMushrooms(){
		for(int i = 0; i < tiles.length; i++){
			for(int j = 0; j < tiles[i].length; j++){
				if (Math.random() < .03){
					tiles[i][j] = 1;//(int)((Math.random() * 4)+1);
					numMushrooms++;
				}
			}
		}
	}
	
	//DRAW FUNCTION
	public void draw(){
		background(0);
		
		//LOOPS THROUGH MUSHROOMS, DRAWS THEM
		for(int i = 0; i < tiles.length; i++){
			for(int j = 0; j < tiles[i].length; j++){
				stroke(150);
				fill(255);
				switch (tiles[i][j]){
					case 0: 
						fill(0);
						break;
					case 1: 
						rect(i*scale,j*scale,scale,scale);
						break;
					case 2:
						rect(i*scale,j*scale,scale,scale*3/4);
						break;
					case 3:
						rect(i*scale,j*scale,scale,scale/2);
						break;
					case 4:
						rect(i*scale,j*scale,scale,scale/4);
						break;
				}
			}
		}
	}

}
