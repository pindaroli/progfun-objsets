import objsets._
object due {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a=new Tweet("olindo","aaa",3)               //> a  : objsets.Tweet = User: olindo
                                                  //| Text: aaa [3]
  val b=new Tweet("manlio","bbb",3)               //> b  : objsets.Tweet = User: manlio
                                                  //| Text: bbb [3]
  
  val c=new Tweet("manlio","ccc",3)               //> c  : objsets.Tweet = User: manlio
                                                  //| Text: ccc [3]
  val d=new Tweet("manlio","ddd",3)               //> d  : objsets.Tweet = User: manlio
                                                  //| Text: ddd [3]
  val sa=new NonEmpty(a,new Empty,new Empty)      //> sa  : objsets.NonEmpty = {.aaa.}
  val sb=new NonEmpty(b,new Empty,new Empty)      //> sb  : objsets.NonEmpty = {.bbb.}
  val sc=new NonEmpty(c,new Empty,new Empty)      //> sc  : objsets.NonEmpty = {.ccc.}
  val sd=new NonEmpty(d,new Empty,new Empty)      //> sd  : objsets.NonEmpty = {.ddd.}
  sa union sc union sb                            //> res0: objsets.TweetSet = {{.aaa.}bbb{.ccc.}}
 	sc union sa union sb union sd             //> res1: objsets.TweetSet = {{.aaa{.bbb{.ccc.}}}ddd.}
  GoogleVsApple.googleTweets foreach println      //> User: mashable
                                                  //| Text: 5 Mobile Photographers Capturing the World With #Android http://t.co/7
                                                  //| 86NneBt [78]
                                                  //| User: mashable
                                                  //| Text: 7 Free #Android Apps for Killing Time in Lines http://t.co/eKu5hhsh [4
                                                  //| 2]
                                                  //| User: CNET
                                                  //| Text: A mathematician accurately predicted when Android's app store would hi
                                                  //| t 25 billion downloads http://t.co/VFLBJ0z3 [36]
                                                  //| User: engadget
                                                  //| Text: AT&amp;T 4G LTE adds Galaxy Note 2, Galay Tab 2 10.1, Galaxy Express a
                                                  //| nd Galaxy Rugby Pro to lineup -  http://t.co/uvBFFMQO [12]
                                                  //| Output exceeds cutoff limit. 
}