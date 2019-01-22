package Test02;

public class Man extends People implements Movement{
    @Override
    public void speak(String str) {
        System.out.println("姓名为  "+this.getName()+"  的 "+this.getCountry()+" 人在说着 "+str);
    }

    public Man() {
    }

    public Man(String name, String country) {
        super(name, country);
    }

    @Override
    public void exercise() {
        System.out.println(this.getName()+"  正在锻炼中!");
    }
    public void life(){
        speak("中国话");
        exercise();
    }
}
