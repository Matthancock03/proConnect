
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/{_display_(Seq[Any](format.raw/*5.21*/("""
  """),_display_(Seq[Any](/*6.4*/navbar/*6.10*/.render)),format.raw/*6.17*/("""


<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-xs-2 column logo-img img-div">

        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*13.71*/routes/*13.77*/.Assets.at("images/profile_holder.png"))),format.raw/*13.116*/("""" />

        <label for="exampleInputFile">Profile Image</label><input type="file" id="exampleInputFile" />
		</div>
    <div class="col-xs-2 column">
    </div>
		<div class="col-xs-6 column">
      """),_display_(Seq[Any](/*20.8*/helper/*20.14*/.form(action = routes.NewsFeed.homeFeed)/*20.54*/{_display_(Seq[Any](format.raw/*20.55*/("""
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*22.8*/helper/*22.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*22.88*/("""
           """),_display_(Seq[Any](/*23.13*/helper/*23.19*/.inputText(user("aboutMe"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*23.105*/("""
           """),_display_(Seq[Any](/*24.13*/helper/*24.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*24.97*/("""
           """),_display_(Seq[Any](/*25.13*/helper/*25.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*25.112*/("""
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
            """),_display_(Seq[Any](/*35.14*/helper/*35.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*35.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*38.14*/helper/*38.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*38.115*/("""
            <div>
            <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
            </button>
            <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
            </button>
          </div>
          </div>
          <div class="break-after">
              """),_display_(Seq[Any](/*49.16*/helper/*49.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*49.133*/("""
              <div>
              <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
              </button>
              <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
              </button>
            </div>
            </div>
            <div class="break-after">
                """),_display_(Seq[Any](/*60.18*/helper/*60.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*60.117*/("""
                <div>
                <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
              </div>
          </div>
          <button type="submit" class="btn save-button">Submit</button>
    </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*74.6*/("""
		</div>
""")))})),format.raw/*76.2*/("""
"""))}
    }
    
    def render(user:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 24 19:15:47 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: e4f27fdd8bd19ca70bf2076ad40a4096440ac4a8
                    MATRIX: 784->1|912->19|940->38|976->40|1002->58|1040->59|1078->63|1092->69|1120->76|1337->257|1352->263|1414->302|1651->504|1666->510|1715->550|1754->551|1838->600|1853->606|1949->680|1998->693|2013->699|2122->785|2171->798|2186->804|2286->882|2335->895|2350->901|2466->994|2730->1222|2745->1228|2861->1321|2964->1388|2979->1394|3097->1489|3620->1976|3635->1982|3769->2093|4314->2602|4329->2608|4445->2701|5098->3323|5140->3334
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|41->13|41->13|41->13|48->20|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|63->35|63->35|63->35|66->38|66->38|66->38|77->49|77->49|77->49|88->60|88->60|88->60|102->74|104->76
                    -- GENERATED --
                */
            