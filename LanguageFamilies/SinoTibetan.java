public class SinoTibetan extends Language{ // 定义一个名为SinoTibetan的公共类，继承自Language类
    SinoTibetan(String languageName, int speakers) { // 定义SinoTibetan类的构造函数
      super(languageName, speakers, "Asia", "subject-object-verb"); // 调用父类Language的构造函数，初始化语言名称、说这种语言的人数、主要使用地区和词序
      if (languageName.contains("Chinese")){ // 如果语言名称包含"Chinese"
        this.wordOrder="subject-verb-object"; // 将词序设置为"subject-verb-object"
      }
    }
  }