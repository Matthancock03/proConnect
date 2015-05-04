
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

    <div class="col-md-6 column">
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
      <div class="col-xs-8 column">
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
    <div class="col-xs-8 column">
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
    <div class="col-xs-8 column">
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
    <div class="col-xs-8 column">
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
                    DATE: Mon May 04 00:25:34 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: 414d98a18373248c01fb10f7f66f3e257420d08b
                    MATRIX: 787->1|913->17|941->36|1007->67|1021->73|1083->114|1122->119|1147->136|1185->137|1221->139|1234->145|1262->152|1402->257|1442->288|1481->289|1574->346|1589->352|1651->391|1681->403|1694->407|1733->408|1840->479|1855->485|1917->524|1963->538|2009->548|2043->573|2082->574|2138->594|2151->598|2182->607|2220->626|2233->630|2272->631|2347->674|2766->1057|2816->1098|2855->1099|3705->1913|3718->1917|3746->1923|4009->2154|4188->2297|4221->2321|4260->2322|4312->2338|4325->2342|4355->2350|4402->2365|4446->2374|4487->2406|4526->2407|4578->2423|4591->2427|4629->2443|4676->2458|4720->2467|4754->2492|4793->2493|4845->2509|4858->2513|4889->2522|4936->2537|5185->2750|5218->2774|5257->2775|5321->2803|5334->2807|5364->2815|5421->2840|5632->3015|5669->3042|5709->3043|5766->3063|5780->3067|5814->3078|5865->3097|6091->3287|6128->3314|6168->3315|6225->3335|6239->3339|6271->3348|6322->3367|6529->3538|6566->3565|6606->3566|6663->3586|6677->3590|6710->3600|6761->3619|6822->3648
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|60->32|60->32|60->32|84->56|84->56|84->56|91->63|101->73|101->73|101->73|102->74|102->74|102->74|103->75|105->77|105->77|105->77|106->78|106->78|106->78|107->79|109->81|109->81|109->81|110->82|110->82|110->82|111->83|123->95|123->95|123->95|125->97|125->97|125->97|127->99|139->111|139->111|139->111|141->113|141->113|141->113|143->115|154->126|154->126|154->126|156->128|156->128|156->128|158->130|169->141|169->141|169->141|171->143|171->143|171->143|173->145|177->149
                    -- GENERATED --
                */
            