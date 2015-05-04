
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

      <!-- Large modal -->
  <button type="button" class="btn btn-default edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*32.12*/form(routes.UserController.sendMessage())/*32.53*/{_display_(Seq[Any](format.raw/*32.54*/("""

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
            					value=""""),_display_(Seq[Any](/*56.26*/user/*56.30*/.email)),format.raw/*56.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*63.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*73.10*/if(user.aboutMe != null)/*73.34*/{_display_(Seq[Any](format.raw/*73.35*/("""
          <h3>"""),_display_(Seq[Any](/*74.16*/user/*74.20*/.aboutMe)),format.raw/*74.28*/("""</h3>
        """)))})),format.raw/*75.10*/("""

      """),_display_(Seq[Any](/*77.8*/if(user.currentEmployer != null)/*77.40*/{_display_(Seq[Any](format.raw/*77.41*/("""
          <h3>"""),_display_(Seq[Any](/*78.16*/user/*78.20*/.currentEmployer)),format.raw/*78.36*/("""</h3>
        """)))})),format.raw/*79.10*/("""

      """),_display_(Seq[Any](/*81.8*/if(user.location != null)/*81.33*/{_display_(Seq[Any](format.raw/*81.34*/("""
          <h3>"""),_display_(Seq[Any](/*82.16*/user/*82.20*/.location)),format.raw/*82.29*/("""</h3>
        """)))})),format.raw/*83.10*/("""
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
        """),_display_(Seq[Any](/*95.10*/if(user.aboutMe != null)/*95.34*/{_display_(Seq[Any](format.raw/*95.35*/("""
          <p>
            """),_display_(Seq[Any](/*97.14*/user/*97.18*/.aboutMe)),format.raw/*97.26*/("""
          </p>
        """)))})),format.raw/*99.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*111.8*/if(user.experience != null)/*111.35*/{_display_(Seq[Any](format.raw/*111.36*/("""
      <p>
        """),_display_(Seq[Any](/*113.10*/user/*113.14*/.experience)),format.raw/*113.25*/("""
      </p>
      """)))})),format.raw/*115.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*126.8*/if(user.experience != null)/*126.35*/{_display_(Seq[Any](format.raw/*126.36*/("""
      <p>
        """),_display_(Seq[Any](/*128.10*/user/*128.14*/.projects)),format.raw/*128.23*/("""
      </p>
      """)))})),format.raw/*130.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*141.8*/if(user.experience != null)/*141.35*/{_display_(Seq[Any](format.raw/*141.36*/("""
      <p>
        """),_display_(Seq[Any](/*143.10*/user/*143.14*/.education)),format.raw/*143.24*/("""
      </p>
      """)))})),format.raw/*145.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*149.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 13:38:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: af700db6d66841a601e089949cde0ff1bb3b6e30
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1980->555|2027->566|2061->591|2100->592|2157->613|2170->617|2201->626|2240->646|2253->650|2292->651|2369->696|2797->1088|2847->1129|2886->1130|3760->1968|3773->1972|3801->1978|4071->2216|4295->2404|4328->2428|4367->2429|4420->2446|4433->2450|4463->2458|4511->2474|4557->2485|4598->2517|4637->2518|4690->2535|4703->2539|4741->2555|4789->2571|4835->2582|4869->2607|4908->2608|4961->2625|4974->2629|5005->2638|5053->2654|5349->2914|5382->2938|5421->2939|5487->2969|5500->2973|5530->2981|5589->3008|5847->3230|5884->3257|5924->3258|5983->3280|5997->3284|6031->3295|6084->3316|6356->3552|6393->3579|6433->3580|6492->3602|6506->3606|6538->3615|6591->3636|6844->3853|6881->3880|6921->3881|6980->3903|6994->3907|7027->3917|7080->3938|7145->3971
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|60->32|60->32|60->32|84->56|84->56|84->56|91->63|101->73|101->73|101->73|102->74|102->74|102->74|103->75|105->77|105->77|105->77|106->78|106->78|106->78|107->79|109->81|109->81|109->81|110->82|110->82|110->82|111->83|123->95|123->95|123->95|125->97|125->97|125->97|127->99|139->111|139->111|139->111|141->113|141->113|141->113|143->115|154->126|154->126|154->126|156->128|156->128|156->128|158->130|169->141|169->141|169->141|171->143|171->143|171->143|173->145|177->149
                    -- GENERATED --
                */
            