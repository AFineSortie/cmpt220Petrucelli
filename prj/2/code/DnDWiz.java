import java.io.PrintWriter;
import java.util.Scanner;
public class DnDWiz {

	public static void main(String[] args) {
		//Set up the table of modifiers
		int[] mods = new int[30];
		for (int a = 0; a < mods.length; a++) {
			mods[a] = (a + 1) / 2 - 5;
		}
		
//set up the default party size
		PC[] party = new PC[4];
		int pSize = 0;
		
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		
		System.out.println("Enter 'help' for help");
		while (cont) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException g) {
				System.out.println("Got interrupted");
			}
			System.out.print("\nEnter a command: ");
			String cmd = input.next();
			
//Help
			if (cmd.equals("help")) {
				System.out.println("\nPossible commands: help, quit, roll, getmod, enterpc, seepc, printpc");
				
//Quit	
			} else if (cmd.equals("quit")) {
				cont = false;
				
//Roll dice
			} else if (cmd.equals("roll")) {
				System.out.print("\nEnter the size of the dice: ");
				int diceSize = input.nextInt();
				System.out.println("\nResult of the d" + diceSize + " roll: " +rollDice(diceSize));
			
//Get Modifier
			} else if (cmd.equals("getmod")) {
				System.out.print("\nEnter the attribute number: ");
				int attr = input.nextInt();
				System.out.println("\nThe modifier for an attribute of " + attr + " is: " + getMod(mods, attr));
			
//Enter PC
			} else if (cmd.equals("enterpc")) {
				System.out.print("\n\nEnter the character's name: ");
				String name = input.next();
				System.out.print("Enter the character's level: ");
				int level = input.nextInt();
				System.out.print("Enter the character's maximum HP: ");
				int hp = input.nextInt();
				System.out.print("Enter the character's primary attributes (S D C I W Ch). A standard array of 15, 14, 13, 12, 10, 8 is reccomended for level 1 characters: ");
				int str = input.nextInt();
				int dex = input.nextInt();
				int con = input.nextInt();
				int intel = input.nextInt();
				int wis = input.nextInt();
				int cha = input.nextInt();
				System.out.print("Enter the character's three skill proficiencies (alphabetical 1 - 18): ");
				int prof1 = input.nextInt() - 1;
				int prof2 = input.nextInt() - 1;
				int prof3 = input.nextInt() - 1;
				//Create character of PC class and assign it to a place in the party
				party[pSize] = new PC(name, level, hp, str, dex, con, intel, wis, cha, prof1, prof2, prof3);
				try {
					setSkills(party, pSize, mods);
					System.out.print("\nEntered PC " + party[pSize].name);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.print("\nParty Full!");
				}
				pSize += 1;
				
//See the stats of the entered PC	
			} else if (cmd.equals("seepc")) {
				System.out.print("\nWhich character of the party would you like to see (1, 2, 3, 4): ");
				int charToSee = input.nextInt();
				
				try {
					System.out.println("\nName: " + party[charToSee - 1].name);
					System.out.println("Max HP: " + party[charToSee - 1].hp);
					System.out.println("Strength: " + party[charToSee - 1].str);
					System.out.println("Dexterity: " + party[charToSee - 1].dex);
					System.out.println("Constitution: " + party[charToSee - 1].con);
					System.out.println("Intelligence: " + party[charToSee - 1].intel);
					System.out.println("Wisdom: " + party[charToSee - 1].wis);
					System.out.println("Charisma: " + party[charToSee - 1].cha);
				} catch (ArrayIndexOutOfBoundsException f) {
					System.err.print("\nInvalid position");
				}
				
//Write character to a file
			} else if (cmd.equals("printpc")) {
				System.out.print("\nWhich character would you like to print (1, 2, 3, 4): ");
				int charNum = input.nextInt();
				try {
					try {
						PrintWriter output = new PrintWriter(party[charNum - 1].name + ".txt");
						output.println("\nName: " + party[charNum - 1].name);
						output.println("HP: " + party[charNum - 1].hp);
						output.println("Strength: " + party[charNum - 1].str + " Mod: " + getMod(mods, party[charNum - 1].str));
						output.println("Dexterity: " + party[charNum - 1].dex + " Mod: " + getMod(mods, party[charNum - 1].dex));
						output.println("Constitution: " + party[charNum - 1].con + " Mod: " + getMod(mods, party[charNum - 1].con));
						output.println("Intelligence: " + party[charNum - 1].intel + " Mod: " + getMod(mods, party[charNum - 1].intel));
						output.println("Wisdom: " + party[charNum - 1].wis + " Mod: " + getMod(mods, party[charNum - 1].wis));
						output.println("Charisma: " + party[charNum - 1].cha + " Mod: " + getMod(mods, party[charNum - 1].cha));
						output.println();
						output.println("Skills:");
						output.println("Acrobatics: " + party[charNum - 1].skills[0]);
						output.println("Animal Handling: " + party[charNum - 1].skills[1]);
						output.println("Arcana: " + party[charNum - 1].skills[2]);
						output.println("Athletics: " + party[charNum - 1].skills[3]);
						output.println("Deception: " + party[charNum - 1].skills[4]);
						output.println("History: " + party[charNum - 1].skills[5]);
						output.println("Insight: " + party[charNum - 1].skills[6]);
						output.println("Intimidation: " + party[charNum - 1].skills[7]);
						output.println("Investigation: " + party[charNum - 1].skills[8]);
						output.println("Medicine: " + party[charNum - 1].skills[9]);
						output.println("Nature: " + party[charNum - 1].skills[10]);
						output.println("Perception: " + party[charNum - 1].skills[11]);
						output.println("Performance: " + party[charNum - 1].skills[12]);
						output.println("Persuasion: " + party[charNum - 1].skills[13]);
						output.println("Religion: " + party[charNum - 1].skills[14]);
						output.println("Slight of Hand: " + party[charNum - 1].skills[15]);
						output.println("Stealth: " + party[charNum - 1].skills[16]);
						output.println("Survival: " + party[charNum - 1].skills[17]);
						output.println();
						output.println("Equipped Items: ");
						output.println();
						output.println("Inventory: ");
						output.close();
						System.out.println("\nSuccess!");
					} catch (java.lang.NullPointerException f) {
						System.err.print("\nIndex out of bounds");
					}
				} catch (java.io.IOException e) {
					System.err.print("/nError");
				}	
			} else {
				System.out.println("\nCommand not recognized");
			}
		}
	}
	
//Returns an int between 1 and dice
	public static int rollDice(int dice) {
		int roll = (int)((Math.random() * dice) + 1);
		return roll;
	}
	
//Returns the int that represents the modifier for the given attribute number
	public static int getMod(int[] mods, int attrNum) {
		return mods[attrNum];
	}
	
	public static void setSkills(PC[] party, int pSize, int[] mods) {
		int strMod = getMod(mods, party[pSize].str);
		int dexMod = getMod(mods, party[pSize].dex);
		int intMod = getMod(mods, party[pSize].intel);
		int wisMod = getMod(mods, party[pSize].wis);
		int chaMod = getMod(mods, party[pSize].cha);

		party[pSize].skills[0] += dexMod;
		party[pSize].skills[15] += dexMod;
		party[pSize].skills[16] += dexMod;
		
		party[pSize].skills[1] += wisMod;
		party[pSize].skills[6] += wisMod;
		party[pSize].skills[9] += wisMod;
		party[pSize].skills[11] += wisMod;
		party[pSize].skills[17] += wisMod;
		
		party[pSize].skills[2] += intMod;
		party[pSize].skills[5] += intMod;
		party[pSize].skills[8] += intMod;
		party[pSize].skills[10] += intMod;
		party[pSize].skills[14] += intMod;
		
		party[pSize].skills[3] += strMod;
		
		party[pSize].skills[4] += chaMod;
		party[pSize].skills[7] += chaMod;
		party[pSize].skills[12] += chaMod;
		party[pSize].skills[13] += chaMod;
	}
}
