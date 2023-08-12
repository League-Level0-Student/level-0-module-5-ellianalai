package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happiness = 0;
	static String pet = JOptionPane.showInputDialog("What pet would you like to buy: dog, cat, fish, or snake?");
	static String name = JOptionPane.showInputDialog("What would you like to name your pet?");
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		while (happiness<=5) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Give food and water", "Give a Bath", "Clean up Poop" }, null);
			
			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				cuddle(pet);
			}
			else if (task == 1) {
				food_and_water(pet);
			}
			else if (task == 2) {
				bath(pet);
			}
			else if (task == 3) {
				poop(pet);
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happiness>=5) {
				JOptionPane.showMessageDialog(null, name + " is very happy and you love " + name + "very much <3");
				break;
			}
			else if (happiness<=-7) {
				JOptionPane.showMessageDialog(null, name + " dies due to obliviousness, stupidity, and negligence :(");
				break;
			}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle (String message) {
		if (message.equals("dog")) {
			JOptionPane.showMessageDialog(null,  name + " barks and it's happiness is increased");
			happiness +=2;
		}
		if (message.equals("cat")) {
			JOptionPane.showMessageDialog(null, name + " purrs and it's happiness is increased");
			happiness +=4;
		}
		if (message.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Why would you cuddle with a fish? You take " + name + " out of the fish tank and it dies :(");
			happiness -=10;
		}
		if (message.equals("snake")) {
			JOptionPane.showMessageDialog(null, name +  " hisses, it clearly doesn't wish to be cuddled and it's happiness is decreased");
			happiness -=1;
		}
			}
	public static void food_and_water (String message) {
		if (message.equals("dog")) {
			JOptionPane.showMessageDialog(null, name +  " exuberantly runs up to the food and water bowl and chows down the food. It's happiness is increased");
			happiness +=2;
		}
		if (message.equals("cat")) {
			JOptionPane.showMessageDialog(null, name +  " gives you a grumpy stare and reluctantly goes to the automatic food and water dispenser. It's happiness is neither increased nor decreased");
			happiness +=1;
		}
		if (message.equals("fish")) {
			JOptionPane.showMessageDialog(null, name + " swims up to the top of the bowl and one by one eats the little pieces of fish food. Since you accidentally forgot to feed your fish for a week, it's happinesss skyrockets");
			happiness +=3;
		}
		if (message.equals("snake")) {
			JOptionPane.showMessageDialog(null, "You tentatively drop a live mouse into" + name + "'s cage and watch with fascination and horror as it swiftly kills then devours the poor mouse. The snake is very happy :)");
			happiness +=3;
		}
	
			}
	public static void bath (String message) {
		if (message.equals("dog")) {
			JOptionPane.showMessageDialog(null, name + " sees the outdoor bath and happily jumps in, you clean your dog and your dog shakes water all over your clothes, but you don't mind because " + name + " is just too cute");
			happiness +=2;
		}
		if (message.equals("cat")) {
			JOptionPane.showMessageDialog(null, "You lure " + name + " into the bathroom and once it sees the bath you set up, " + name + " growls and hisses at you and scratches you until you are forced to drop " + name + " and it runs out of the bathroom. " + name + " is very upset");
			happiness -=3;
		}
		if (message.equals("fish")) {
			JOptionPane.showMessageDialog(null, "You try to give " + name + " a bath by taking it out of its tank and washing it in the sink. But, you accidentally leave the drain open and " + name + " washes down the drain just like nemo. You never see " + name + " again.");
			happiness -=10;
		}
		if (message.equals("snake")) {
			JOptionPane.showMessageDialog(null, "After a quick google search, you realize that snakes can actually be given baths and you put an open pan of water in " + name + "'s enclosure and watch as it submerges itself. " + name + " looks very relaxed");
			happiness +=2;
		}
			}
	public static void poop (String message) {
		if (message.equals("dog")) {
			JOptionPane.showMessageDialog(null, "You take " + name + " to your front yard and watch with horror as it does its business all over your mom's precious poppies. You groan with dread for when your mom finds out, but at least " + name + " seems happy");
			happiness +=1;
		}
		if (message.equals("cat")) {
			JOptionPane.showMessageDialog(null, "It is your turn this week to clean up the kitty litter and once you do, " + name + " immediately does its business and seems satisfied");
			happiness +=2;
		}
		if (message.equals("fish")) {
			JOptionPane.showMessageDialog(null, "It is the time of the month to clean out the fish tank and you put " + name + " in a plastic bag while you clean out the accumulating debris and wash the filter. You put " + name + " back into its tank and " + name + " swims happily around");
			happiness +=4;
		}
		if (message.equals("snake")) {
			JOptionPane.showMessageDialog(null, "After 3 weeks, " + name + " has finally done its business and unfortunately, that means you have to clean it up. Once you do, " + name + " seems very content");
			happiness +=2;
		}
			}
	
}