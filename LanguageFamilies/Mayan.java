public class Mayan extends Language{ // 定义一个名为Mayan的公共类，继承自Language类
  
    Mayan(String languageName, int speakers) { // 定义Mayan类的构造函数
      super(languageName, speakers, "Central America", "verb-object-subject"); // 调用父类Language的构造函数，初始化语言名称、说这种语言的人数、主要使用地区和词序
    }
    @Override
    public void getInfo(){ // 重写父类的getInfo方法
      System.out.println(this.name+" is spoken by "+ this.numSpeakers+" people mainly in "+this.regionSpoken+"."); // 输出语言的名称、说这种语言的人数和主要使用地区
      System.out.println("The language follows the word order: "+this.wordOrder); // 输出这种语言的词序
      System.out.println("Fun fact: "+this.name+" is an ergative language."); // 输出一个有趣的事实：这种语言是作格语言
    }
  }