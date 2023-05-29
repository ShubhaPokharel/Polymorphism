class Polymorphism{
	void giftCard(String name){
		System.out.println("Your gift card is a car");
	}
	void giftCard(long mobile){
		System.out.println("Your gift card is a mobile");
	}
	void giftCard(int schoolId, String schoolName){
		System.out.println("Your gift card is a house");
	}
	public static void main(String[] args){
		Polymorphism polysmorph = new Polymorphism();
		polysmorph.giftCard("Shubha");
		polysmorph.giftCard(9401104972L);
		polysmorph.giftCard(4444, "Harrison Middle School");
	}
}