
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
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

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
      <a href=""""),_display_(Seq[Any](/*24.17*/routes/*24.23*/.DbController.profileMain())),format.raw/*24.50*/("""">
          <div>
          <button type="button" class="btn btn-default edit-button" name="editButton">Edit Profile</button>
        </div>
     </a>
      <!-- Large modal -->
  <button type="button" class="btn btn-default edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*36.12*/form(routes.UserController.sendMessage())/*36.53*/{_display_(Seq[Any](format.raw/*36.54*/("""

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
          	""")))})),format.raw/*59.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column">
        """),_display_(Seq[Any](/*69.10*/if(user.aboutMe != null)/*69.34*/{_display_(Seq[Any](format.raw/*69.35*/("""
          <h3>"""),_display_(Seq[Any](/*70.16*/user/*70.20*/.aboutMe)),format.raw/*70.28*/("""</h3>
        """)))})),format.raw/*71.10*/("""

      """),_display_(Seq[Any](/*73.8*/if(user.currentEmployer != null)/*73.40*/{_display_(Seq[Any](format.raw/*73.41*/("""
          <h3>"""),_display_(Seq[Any](/*74.16*/user/*74.20*/.currentEmployer)),format.raw/*74.36*/("""</h3>
        """)))})),format.raw/*75.10*/("""

      """),_display_(Seq[Any](/*77.8*/if(user.location != null)/*77.33*/{_display_(Seq[Any](format.raw/*77.34*/("""
          <h3>"""),_display_(Seq[Any](/*78.16*/user/*78.20*/.location)),format.raw/*78.29*/("""</h3>
        """)))})),format.raw/*79.10*/("""
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
        """),_display_(Seq[Any](/*91.10*/if(user.aboutMe != null)/*91.34*/{_display_(Seq[Any](format.raw/*91.35*/("""
          <p>
            """),_display_(Seq[Any](/*93.14*/user/*93.18*/.aboutMe)),format.raw/*93.26*/("""
          </p>
        """)))})),format.raw/*95.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*107.8*/if(user.experience != null)/*107.35*/{_display_(Seq[Any](format.raw/*107.36*/("""
      <p>
        """),_display_(Seq[Any](/*109.10*/user/*109.14*/.experience)),format.raw/*109.25*/("""
      </p>
      """)))})),format.raw/*111.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*122.8*/if(user.experience != null)/*122.35*/{_display_(Seq[Any](format.raw/*122.36*/("""
      <p>
        """),_display_(Seq[Any](/*124.10*/user/*124.14*/.projects)),format.raw/*124.23*/("""
      </p>
      """)))})),format.raw/*126.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*137.8*/if(user.experience != null)/*137.35*/{_display_(Seq[Any](format.raw/*137.36*/("""
      <p>
        """),_display_(Seq[Any](/*139.10*/user/*139.14*/.education)),format.raw/*139.24*/("""
      </p>
      """)))})),format.raw/*141.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*145.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 18:07:30 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 7a72ce311385df4c8f5815d033857e3ab41871ea
                    MATRIX: 783->1|909->17|937->36|1003->67|1017->73|1079->114|1118->119|1143->136|1181->137|1217->139|1230->145|1258->152|1398->257|1438->288|1477->289|1570->346|1585->352|1647->391|1677->403|1690->407|1729->408|1836->479|1851->485|1913->524|1959->538|2005->548|2039->573|2078->574|2134->594|2147->598|2178->607|2216->626|2229->630|2268->631|2343->674|2396->691|2411->697|2460->724|3029->1257|3079->1298|3118->1299|3932->2081|4111->2224|4144->2248|4183->2249|4235->2265|4248->2269|4278->2277|4325->2292|4369->2301|4410->2333|4449->2334|4501->2350|4514->2354|4552->2370|4599->2385|4643->2394|4677->2419|4716->2420|4768->2436|4781->2440|4812->2449|4859->2464|5108->2677|5141->2701|5180->2702|5244->2730|5257->2734|5287->2742|5344->2767|5555->2942|5592->2969|5632->2970|5689->2990|5703->2994|5737->3005|5788->3024|6014->3214|6051->3241|6091->3242|6148->3262|6162->3266|6194->3275|6245->3294|6452->3465|6489->3492|6529->3493|6586->3513|6600->3517|6633->3527|6684->3546|6745->3575
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|64->36|64->36|64->36|87->59|97->69|97->69|97->69|98->70|98->70|98->70|99->71|101->73|101->73|101->73|102->74|102->74|102->74|103->75|105->77|105->77|105->77|106->78|106->78|106->78|107->79|119->91|119->91|119->91|121->93|121->93|121->93|123->95|135->107|135->107|135->107|137->109|137->109|137->109|139->111|150->122|150->122|150->122|152->124|152->124|152->124|154->126|165->137|165->137|165->137|167->139|167->139|167->139|169->141|173->145
                    -- GENERATED --
                */
            