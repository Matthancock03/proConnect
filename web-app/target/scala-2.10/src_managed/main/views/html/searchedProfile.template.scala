
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
  <button type="button" class="btn btn-success edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>
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
                    DATE: Wed May 06 23:01:03 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: 8d5fbf0ac53529c6afcb3ae0cc960b586e407ed9
                    MATRIX: 795->1|941->37|969->56|1035->87|1049->93|1111->134|1150->139|1175->156|1213->157|1249->159|1262->165|1290->172|1430->277|1470->308|1509->309|1602->366|1617->372|1679->411|1709->423|1722->427|1761->428|1868->499|1883->505|1945->544|1990->557|2036->567|2059->581|2098->582|2154->602|2169->608|2232->649|2354->753|2367->757|2406->758|2462->778|2477->784|2543->828|2688->942|3028->1246|3062->1271|3101->1272|3158->1293|3171->1297|3202->1306|3240->1325|3253->1329|3292->1330|3367->1373|3417->1387|3450->1411|3489->1412|3541->1428|3554->1432|3584->1440|3631->1455|3675->1464|3716->1496|3755->1497|3807->1513|3820->1517|3858->1533|3905->1548|3949->1557|3983->1582|4022->1583|4074->1599|4087->1603|4118->1612|4165->1627|4459->1885|4509->1926|4548->1927|5398->2741|5411->2745|5439->2751|5702->2982|6050->3293|6084->3317|6124->3318|6189->3346|6203->3350|6234->3358|6292->3383|6394->3449|6431->3476|6471->3477|6528->3497|6542->3501|6576->3512|6627->3531|6744->3612|6781->3639|6821->3640|6878->3660|6892->3664|6924->3673|6975->3692|7071->3752|7108->3779|7148->3780|7205->3800|7219->3804|7252->3814|7303->3833|7377->3875
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|85->57|85->57|85->57|109->81|109->81|109->81|116->88|134->106|134->106|134->106|136->108|136->108|136->108|138->110|146->118|146->118|146->118|148->120|148->120|148->120|150->122|157->129|157->129|157->129|159->131|159->131|159->131|161->133|166->138|166->138|166->138|168->140|168->140|168->140|170->142|175->147
                    -- GENERATED --
                */
            