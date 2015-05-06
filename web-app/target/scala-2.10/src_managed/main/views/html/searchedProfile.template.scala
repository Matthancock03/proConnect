
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
object searchedProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

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
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/if(user.userName != null)/*19.35*/{_display_(Seq[Any](format.raw/*19.36*/("""
              <h4>"""),_display_(Seq[Any](/*20.20*/user/*20.24*/.userName)),format.raw/*20.33*/("""</h4>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*23.14*/("""
  <a href=""""),_display_(Seq[Any](/*24.13*/routes/*24.19*/.UserController.addConnection(user.email))),format.raw/*24.60*/(""""><button type="button" class="btn btn-default edit-button" name="connect">Connect</button></a>

      <!-- Large modal -->
  <button type="button" class="btn btn-default edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*33.12*/form(routes.UserController.sendMessage())/*33.53*/{_display_(Seq[Any](format.raw/*33.54*/("""

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
            					value=""""),_display_(Seq[Any](/*57.26*/user/*57.30*/.email)),format.raw/*57.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*64.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*74.10*/if(user.aboutMe != null)/*74.34*/{_display_(Seq[Any](format.raw/*74.35*/("""
          <h3>"""),_display_(Seq[Any](/*75.16*/user/*75.20*/.aboutMe)),format.raw/*75.28*/("""</h3>
        """)))})),format.raw/*76.10*/("""

      """),_display_(Seq[Any](/*78.8*/if(user.currentEmployer != null)/*78.40*/{_display_(Seq[Any](format.raw/*78.41*/("""
          <h3>"""),_display_(Seq[Any](/*79.16*/user/*79.20*/.currentEmployer)),format.raw/*79.36*/("""</h3>
        """)))})),format.raw/*80.10*/("""

      """),_display_(Seq[Any](/*82.8*/if(user.location != null)/*82.33*/{_display_(Seq[Any](format.raw/*82.34*/("""
          <h3>"""),_display_(Seq[Any](/*83.16*/user/*83.20*/.location)),format.raw/*83.29*/("""</h3>
        """)))})),format.raw/*84.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*96.10*/if(user.aboutMe != null)/*96.34*/{_display_(Seq[Any](format.raw/*96.35*/("""
          <p>
            """),_display_(Seq[Any](/*98.14*/user/*98.18*/.aboutMe)),format.raw/*98.26*/("""
          </p>
        """)))})),format.raw/*100.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*112.8*/if(user.experience != null)/*112.35*/{_display_(Seq[Any](format.raw/*112.36*/("""
      <p>
        """),_display_(Seq[Any](/*114.10*/user/*114.14*/.experience)),format.raw/*114.25*/("""
      </p>
      """)))})),format.raw/*116.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*127.8*/if(user.experience != null)/*127.35*/{_display_(Seq[Any](format.raw/*127.36*/("""
      <p>
        """),_display_(Seq[Any](/*129.10*/user/*129.14*/.projects)),format.raw/*129.23*/("""
      </p>
      """)))})),format.raw/*131.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*142.8*/if(user.experience != null)/*142.35*/{_display_(Seq[Any](format.raw/*142.36*/("""
      <p>
        """),_display_(Seq[Any](/*144.10*/user/*144.14*/.education)),format.raw/*144.24*/("""
      </p>
      """)))})),format.raw/*146.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*150.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 12:54:26 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: 82dfa8d571ca1ca9eada7297aa21d11f294b911d
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1980->555|2027->566|2061->591|2100->592|2157->613|2170->617|2201->626|2240->646|2253->650|2292->651|2369->696|2419->710|2434->716|2497->757|3020->1244|3070->1285|3109->1286|3983->2124|3996->2128|4024->2134|4294->2372|4518->2560|4551->2584|4590->2585|4643->2602|4656->2606|4686->2614|4734->2630|4780->2641|4821->2673|4860->2674|4913->2691|4926->2695|4964->2711|5012->2727|5058->2738|5092->2763|5131->2764|5184->2781|5197->2785|5228->2794|5276->2810|5572->3070|5605->3094|5644->3095|5710->3125|5723->3129|5753->3137|5813->3164|6071->3386|6108->3413|6148->3414|6207->3436|6221->3440|6255->3451|6308->3472|6580->3708|6617->3735|6657->3736|6716->3758|6730->3762|6762->3771|6815->3792|7068->4009|7105->4036|7145->4037|7204->4059|7218->4063|7251->4073|7304->4094|7369->4127
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|61->33|61->33|61->33|85->57|85->57|85->57|92->64|102->74|102->74|102->74|103->75|103->75|103->75|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|110->82|110->82|110->82|111->83|111->83|111->83|112->84|124->96|124->96|124->96|126->98|126->98|126->98|128->100|140->112|140->112|140->112|142->114|142->114|142->114|144->116|155->127|155->127|155->127|157->129|157->129|157->129|159->131|170->142|170->142|170->142|172->144|172->144|172->144|174->146|178->150
                    -- GENERATED --
                */
            