
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
            <div style="width: 50%; margin: 0 auto;">
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

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*55.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column">
        """),_display_(Seq[Any](/*65.10*/if(user.aboutMe != null)/*65.34*/{_display_(Seq[Any](format.raw/*65.35*/("""
          <h3>"""),_display_(Seq[Any](/*66.16*/user/*66.20*/.aboutMe)),format.raw/*66.28*/("""</h3>
        """)))})),format.raw/*67.10*/("""

      """),_display_(Seq[Any](/*69.8*/if(user.currentEmployer != null)/*69.40*/{_display_(Seq[Any](format.raw/*69.41*/("""
          <h3>"""),_display_(Seq[Any](/*70.16*/user/*70.20*/.currentEmployer)),format.raw/*70.36*/("""</h3>
        """)))})),format.raw/*71.10*/("""

      """),_display_(Seq[Any](/*73.8*/if(user.location != null)/*73.33*/{_display_(Seq[Any](format.raw/*73.34*/("""
          <h3>"""),_display_(Seq[Any](/*74.16*/user/*74.20*/.location)),format.raw/*74.29*/("""</h3>
        """)))})),format.raw/*75.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*87.10*/if(user.aboutMe != null)/*87.34*/{_display_(Seq[Any](format.raw/*87.35*/("""
          <p>
            """),_display_(Seq[Any](/*89.14*/user/*89.18*/.aboutMe)),format.raw/*89.26*/("""
          </p>
        """)))})),format.raw/*91.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*103.8*/if(user.experience != null)/*103.35*/{_display_(Seq[Any](format.raw/*103.36*/("""
      <p>
        """),_display_(Seq[Any](/*105.10*/user/*105.14*/.experience)),format.raw/*105.25*/("""
      </p>
      """)))})),format.raw/*107.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*118.8*/if(user.experience != null)/*118.35*/{_display_(Seq[Any](format.raw/*118.36*/("""
      <p>
        """),_display_(Seq[Any](/*120.10*/user/*120.14*/.projects)),format.raw/*120.23*/("""
      </p>
      """)))})),format.raw/*122.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*133.8*/if(user.experience != null)/*133.35*/{_display_(Seq[Any](format.raw/*133.36*/("""
      <p>
        """),_display_(Seq[Any](/*135.10*/user/*135.14*/.education)),format.raw/*135.24*/("""
      </p>
      """)))})),format.raw/*137.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*141.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 21:30:56 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: a6706603b6d4328920247653ca463119f984b3c2
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1980->555|2027->566|2061->591|2100->592|2157->613|2170->617|2201->626|2240->646|2253->650|2292->651|2369->696|2797->1088|2847->1129|2886->1130|3723->1935|3912->2088|3945->2112|3984->2113|4037->2130|4050->2134|4080->2142|4128->2158|4174->2169|4215->2201|4254->2202|4307->2219|4320->2223|4358->2239|4406->2255|4452->2266|4486->2291|4525->2292|4578->2309|4591->2313|4622->2322|4670->2338|4931->2563|4964->2587|5003->2588|5069->2618|5082->2622|5112->2630|5171->2657|5394->2844|5431->2871|5471->2872|5530->2894|5544->2898|5578->2909|5631->2930|5868->3131|5905->3158|5945->3159|6004->3181|6018->3185|6050->3194|6103->3215|6321->3397|6358->3424|6398->3425|6457->3447|6471->3451|6504->3461|6557->3482|6622->3515
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|60->32|60->32|60->32|83->55|93->65|93->65|93->65|94->66|94->66|94->66|95->67|97->69|97->69|97->69|98->70|98->70|98->70|99->71|101->73|101->73|101->73|102->74|102->74|102->74|103->75|115->87|115->87|115->87|117->89|117->89|117->89|119->91|131->103|131->103|131->103|133->105|133->105|133->105|135->107|146->118|146->118|146->118|148->120|148->120|148->120|150->122|161->133|161->133|161->133|163->135|163->135|163->135|165->137|169->141
                    -- GENERATED --
                */
            