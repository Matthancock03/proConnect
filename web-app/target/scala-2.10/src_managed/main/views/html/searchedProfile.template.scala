
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
<<<<<<< HEAD
                    DATE: Mon May 04 13:16:14 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: df545278ddfa0fb0db847a528acd53e4e1d902af
                    MATRIX: 787->1|913->17|941->36|1007->67|1021->73|1083->114|1122->119|1147->136|1185->137|1221->139|1234->145|1262->152|1402->257|1442->288|1481->289|1574->346|1589->352|1651->391|1681->403|1694->407|1733->408|1840->479|1855->485|1917->524|1963->538|2009->548|2043->573|2082->574|2138->594|2151->598|2182->607|2220->626|2233->630|2272->631|2347->674|2766->1057|2816->1098|2855->1099|3705->1913|3718->1917|3746->1923|4009->2154|4223->2332|4256->2356|4295->2357|4347->2373|4360->2377|4390->2385|4437->2400|4481->2409|4522->2441|4561->2442|4613->2458|4626->2462|4664->2478|4711->2493|4755->2502|4789->2527|4828->2528|4880->2544|4893->2548|4924->2557|4971->2572|5255->2820|5288->2844|5327->2845|5391->2873|5404->2877|5434->2885|5491->2910|5737->3120|5774->3147|5814->3148|5871->3168|5885->3172|5919->3183|5970->3202|6231->3427|6268->3454|6308->3455|6365->3475|6379->3479|6411->3488|6462->3507|6704->3713|6741->3740|6781->3741|6838->3761|6852->3765|6885->3775|6936->3794|6997->3823
=======
                    DATE: Mon May 04 10:39:19 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: 37490c183aff1750daf581a6def345b63de0b81f
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1980->555|2027->566|2061->591|2100->592|2157->613|2170->617|2201->626|2240->646|2253->650|2292->651|2369->696|2797->1088|2847->1129|2886->1130|3760->1968|3773->1972|3801->1978|4071->2216|4260->2369|4293->2393|4332->2394|4385->2411|4398->2415|4428->2423|4476->2439|4522->2450|4563->2482|4602->2483|4655->2500|4668->2504|4706->2520|4754->2536|4800->2547|4834->2572|4873->2573|4926->2590|4939->2594|4970->2603|5018->2619|5279->2844|5312->2868|5351->2869|5417->2899|5430->2903|5460->2911|5519->2938|5742->3125|5779->3152|5819->3153|5878->3175|5892->3179|5926->3190|5979->3211|6216->3412|6253->3439|6293->3440|6352->3462|6366->3466|6398->3475|6451->3496|6669->3678|6706->3705|6746->3706|6805->3728|6819->3732|6852->3742|6905->3763|6970->3796
>>>>>>> f9621eebc60b9a4b0951aaff41360a619414dca1
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|60->32|60->32|60->32|84->56|84->56|84->56|91->63|101->73|101->73|101->73|102->74|102->74|102->74|103->75|105->77|105->77|105->77|106->78|106->78|106->78|107->79|109->81|109->81|109->81|110->82|110->82|110->82|111->83|123->95|123->95|123->95|125->97|125->97|125->97|127->99|139->111|139->111|139->111|141->113|141->113|141->113|143->115|154->126|154->126|154->126|156->128|156->128|156->128|158->130|169->141|169->141|169->141|171->143|171->143|171->143|173->145|177->149
                    -- GENERATED --
                */
            