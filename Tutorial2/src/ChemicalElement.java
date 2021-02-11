
public class ChemicalElement {
	
	private String symbol;
	private int atNum;
	private String atNam;
	
	static boolean metals[] = new boolean[120];
	
	static {
		metals[13] = true;
		metals[49] = true;
		metals[50] = true;
		metals[81] = true;
		metals[82] = true;
		metals[83] = true;
		metals[113] = true;
		metals[114] = true;
		metals[115] = true;
		metals[116] = true;
	}
	
	public ChemicalElement(String symbol, int atNum, String atNam)
	{
		this.symbol = symbol;
		this.atNum = atNum;
		this.atNam = atNam;
	}
	
	public boolean isAlkaliMetal()
	{
		switch(atNum)
		{
		case 3:
			return true;
		
		case 11:
			return true;
		
		case 19:
			return true;
		
		case 37:
			return true;
		
		case 55:
			return true;
		
		case 87:
			return true;
		
		}
		return false;
	}
	public boolean isTransitionMetal()
	{
		return ((atNum>=21 && atNum<=31) || (atNum>=39 && atNum<=48) 
				|| (atNum>=72 && atNum<=80) || (atNum>=104 && atNum<=112));
	}
	public boolean isMetal()
	{
		return metals[atNum];
	}
	
	public static void main(String[] args) {
		
		ChemicalElement c = new ChemicalElement("K", 19, "Potassium");
		
		System.out.println("Is Potassium alkali metal? "+ c.isAlkaliMetal());
		System.out.println("Is Potassium transition metal? "+ c.isTransitionMetal());
		System.out.println("Is Potassium metal? "+ c.isMetal());
		

	}

}
