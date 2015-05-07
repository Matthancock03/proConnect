
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object searchedProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[UserModel,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel, connected: Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/profile.min.css"))),format.raw/*5.78*/("""">

"""),_display_(Seq[Any](/*7.2*/main("ProConect")/*7.19*/{_display_(Seq[Any](format.raw/*7.20*/("""
"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""


<div class="container">
  <div class="row clearfix">
    <div class="col-md-2 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/(""""/>
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/if(!connected)/*19.24*/{_display_(Seq[Any](format.raw/*19.25*/("""
         <a href=""""),_display_(Seq[Any](/*20.20*/routes/*20.26*/.UserController.addConnection(user.email))),format.raw/*20.67*/(""""><button type="button" class="btn btn-success edit-button" name="connect">Connect</button></a>
       """)))}/*21.9*/else/*21.13*/{_display_(Seq[Any](format.raw/*21.14*/("""
         <a href=""""),_display_(Seq[Any](/*22.20*/routes/*22.26*/.UserController.removeConnection(user.email))),format.raw/*22.70*/(""""><button type="button" class="btn btn-success edit-button" name="connect">Remove Connection</button></a>
       """)))})),format.raw/*23.9*/("""
      <!-- Large modal -->
  <button type="button" class="btn btn-success edit-button" data-toggle="modal" data-target=".bs-example-modal-lg" style="margin-bottom: 15px;">Send Message</button>
        </div>

<br />
        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*31.10*/if(user.userName != null)/*31.35*/{_display_(Seq[Any](format.raw/*31.36*/("""

              <h4>"""),_display_(Seq[Any](/*33.20*/user/*33.24*/.userName)),format.raw/*33.33*/("""</h4>
            """)))}/*34.14*/else/*34.18*/{_display_(Seq[Any](format.raw/*34.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*36.14*/("""
            """),_display_(Seq[Any](/*37.14*/if(user.aboutMe != null)/*37.38*/{_display_(Seq[Any](format.raw/*37.39*/("""
          <h3>"""),_display_(Seq[Any](/*38.16*/user/*38.20*/.aboutMe)),format.raw/*38.28*/("""</h3>
        """)))})),format.raw/*39.10*/("""

      """),_display_(Seq[Any](/*41.8*/if(user.currentEmployer != null)/*41.40*/{_display_(Seq[Any](format.raw/*41.41*/("""
          <h3>"""),_display_(Seq[Any](/*42.16*/user/*42.20*/.currentEmployer)),format.raw/*42.36*/("""</h3>
        """)))})),format.raw/*43.10*/("""

      """),_display_(Seq[Any](/*45.8*/if(user.location != null)/*45.33*/{_display_(Seq[Any](format.raw/*45.34*/("""
          <h3>"""),_display_(Seq[Any](/*46.16*/user/*46.20*/.location)),format.raw/*46.29*/("""</h3>
        """)))})),format.raw/*47.10*/("""
            </div>
            </div>



  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*57.12*/form(routes.UserController.sendMessage())/*57.53*/{_display_(Seq[Any](format.raw/*57.54*/("""

          	<div class="form-group" style="width: 50%; margin: 0 auto;">
            <div style="width: 75%; margin: 0 auto;">
          		<h2 class="form-signin-heading">Message</h2>
          			<input class="form-control"
          					placeholder="Message Title"
          					type="text"
          					name="messageTitle"
          					id="messageTitle"
          					value=""
          				/>
          			<input class="form-control"
          					placeholder="Message"
          					type="text"
          					name="messageBody"
          					id="messageBody"
          					value=""
          				/>
                  <input class="form-control"
            					placeholder="Message"
            					type="text"
            					name="email"
            					id="email"
            					value=""""),_display_(Seq[Any](/*81.26*/user/*81.30*/.email)),format.raw/*81.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*88.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="row clearfix">
    <div class="col-md-2 column img-div"></div>




        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*106.10*/if(user.aboutMe != null)/*106.34*/{_display_(Seq[Any](format.raw/*106.35*/("""
          <p>
            """),_display_(Seq[Any](/*108.14*/user/*108.18*/.aboutMe)),format.raw/*108.26*/("""
          </p>
        """)))})),format.raw/*110.10*/("""

      <br />


      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*118.8*/if(user.experience != null)/*118.35*/{_display_(Seq[Any](format.raw/*118.36*/("""
      <p>
        """),_display_(Seq[Any](/*120.10*/user/*120.14*/.experience)),format.raw/*120.25*/("""
      </p>
      """)))})),format.raw/*122.8*/("""
    <br />


      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*129.8*/if(user.experience != null)/*129.35*/{_display_(Seq[Any](format.raw/*129.36*/("""
      <p>
        """),_display_(Seq[Any](/*131.10*/user/*131.14*/.projects)),format.raw/*131.23*/("""
      </p>
      """)))})),format.raw/*133.8*/("""
    <br />
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*138.8*/if(user.experience != null)/*138.35*/{_display_(Seq[Any](format.raw/*138.36*/("""
      <p>
        """),_display_(Seq[Any](/*140.10*/user/*140.14*/.education)),format.raw/*140.24*/("""
      </p>
      """)))})),format.raw/*142.8*/("""
      <br />
    </div>
  </div>
</div>
""")))})),format.raw/*147.2*/("""
"""))}
    }
    
    def render(user:UserModel,connected:Boolean): play.api.templates.HtmlFormat.Appendable = apply(user,connected)
    
    def f:((UserModel,Boolean) => play.api.templates.HtmlFormat.Appendable) = (user,connected) => apply(user,connected)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 07 00:23:34 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: bdd3d8e9df4f48b6b21af5b0ef29ee76b4287169
                    MATRIX: 795->1|941->37|969->56|1035->87|1049->93|1111->134|1150->139|1175->156|1213->157|1249->159|1262->165|1290->172|1430->277|1470->308|1509->309|1602->366|1617->372|1679->411|1709->423|1722->427|1761->428|1868->499|1883->505|1945->544|1990->557|2036->567|2059->581|2098->582|2154->602|2169->608|2232->649|2354->753|2367->757|2406->758|2462->778|2477->784|2543->828|2688->942|3057->1275|3091->1300|3130->1301|3187->1322|3200->1326|3231->1335|3269->1354|3282->1358|3321->1359|3396->1402|3446->1416|3479->1440|3518->1441|3570->1457|3583->1461|3613->1469|3660->1484|3704->1493|3745->1525|3784->1526|3836->1542|3849->1546|3887->1562|3934->1577|3978->1586|4012->1611|4051->1612|4103->1628|4116->1632|4147->1641|4194->1656|4488->1914|4538->1955|4577->1956|5427->2770|5440->2774|5468->2780|5731->3011|6079->3322|6113->3346|6153->3347|6218->3375|6232->3379|6263->3387|6321->3412|6423->3478|6460->3505|6500->3506|6557->3526|6571->3530|6605->3541|6656->3560|6773->3641|6810->3668|6850->3669|6907->3689|6921->3693|6953->3702|7004->3721|7100->3781|7137->3808|7177->3809|7234->3829|7248->3833|7281->3843|7332->3862|7406->3904
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|85->57|85->57|85->57|109->81|109->81|109->81|116->88|134->106|134->106|134->106|136->108|136->108|136->108|138->110|146->118|146->118|146->118|148->120|148->120|148->120|150->122|157->129|157->129|157->129|159->131|159->131|159->131|161->133|166->138|166->138|166->138|168->140|168->140|168->140|170->142|175->147
                    -- GENERATED --
                */
            