class Information{
    String msg = "This is the message within Information class";
    int msgId = 1234;
}
class SubInfo extends Information{
    public void message(){
        System.out.println(super.msg);
        String msg = "This is the message within subInfo class";
        System.out.println(msg);
    }
    public void messageId(){
        int msdId = 5678;
        System.out.println("Message ID of first message is "+ super.msgId);
        System.out.println("Message ID of sub message is "+ msdId);

    }
}
public class SuperKeywordWithVariables {
    public static void main(String[] args){
        SubInfo subInfo = new SubInfo();
        subInfo.message();
        subInfo.messageId();
    }
}
