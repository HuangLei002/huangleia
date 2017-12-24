package classfrist;
/**
 * 
 * @author huanglei
 *        定义动物类以及属性
 */
public class Animals {
	String name;
	String weight;
	String from;
	void food(){
		System.out.println("熊猫喜欢吃竹子");
	}; 
	void hobby(){
		System.out.println("熊猫爱烧香！！！");
	}; 
	
	
/**
 * 类的调用	
 * @param args
 */
	public static void main(String[] args) {
	  Animals  panda;
	  panda=new Animals();
	  panda.name="熊猫";
	  panda.from="中国";
	  panda.weight="100kg";
	  
    System.out.println("名称:"+panda.name+"\n"+"来自:"+panda.from+"\n"+"体重:"+panda.weight);
		
		panda.food();
		panda.hobby();

	}

}
