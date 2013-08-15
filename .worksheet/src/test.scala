import objsets._
object test {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(36); 
  val a=new Tweet("olindo","aaa",3);System.out.println("""a  : objsets.Tweet = """ + $show(a ));$skip(36); 
  val b=new Tweet("manlio","bbb",3);System.out.println("""b  : objsets.Tweet = """ + $show(b ));$skip(39); 
  
  val c=new Tweet("manlio","ccc",3);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(36); 
  val d=new Tweet("manlio","ddd",3);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(45); 
  val sa=new NonEmpty(a,new Empty,new Empty);System.out.println("""sa  : objsets.NonEmpty = """ + $show(sa ));$skip(45); 
  val sb=new NonEmpty(b,new Empty,new Empty);System.out.println("""sb  : objsets.NonEmpty = """ + $show(sb ));$skip(45); 
  val sc=new NonEmpty(c,new Empty,new Empty);System.out.println("""sc  : objsets.NonEmpty = """ + $show(sc ));$skip(45); 
  val sd=new NonEmpty(d,new Empty,new Empty);System.out.println("""sd  : objsets.NonEmpty = """ + $show(sd ));$skip(23); val res$0 = 
  sa union sc union sb;System.out.println("""res0: objsets.TweetSet = """ + $show(res$0));$skip(32); val res$1 = 
  sc union sa union sb union sd;System.out.println("""res1: objsets.TweetSet = """ + $show(res$1))}
  //TweetReader.sources
  
  
  
}