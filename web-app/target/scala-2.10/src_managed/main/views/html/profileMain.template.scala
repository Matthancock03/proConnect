
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
      """),_display_(Seq[Any](/*20.8*/helper/*20.14*/.form(action = routes.DbController.saveUser)/*20.58*/{_display_(Seq[Any](format.raw/*20.59*/("""
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*22.8*/helper/*22.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*22.88*/("""
           """),_display_(Seq[Any](/*23.13*/helper/*23.19*/.inputText(user("email"), 'class -> "form-control", '_label -> "Email Address" ))),format.raw/*23.99*/("""
           """),_display_(Seq[Any](/*24.13*/helper/*24.19*/.inputText(user("aboutMe"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*24.105*/("""
           """),_display_(Seq[Any](/*25.13*/helper/*25.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*25.97*/("""
           """),_display_(Seq[Any](/*26.13*/helper/*26.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*26.112*/("""
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
            """),_display_(Seq[Any](/*36.14*/helper/*36.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*36.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*39.14*/helper/*39.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*39.115*/("""
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
              """),_display_(Seq[Any](/*50.16*/helper/*50.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*50.133*/("""
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
                """),_display_(Seq[Any](/*61.18*/helper/*61.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*61.117*/("""
                <div>
                <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
              </div>
          </div>
          <button type="submit" class="btn save-button" style="padding-bottom=25px">Submit</button>
    </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*75.6*/("""
		</div>
""")))})),format.raw/*77.2*/("""
"""))}
    }
    
    def render(user:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 25 11:12:22 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: f8b844fc2662a1e1c8833a7e7bccb72ffc3630ad
                    MATRIX: 784->1|912->19|940->38|976->40|1002->58|1040->59|1078->63|1092->69|1120->76|1337->257|1352->263|1414->302|1651->504|1666->510|1719->554|1758->555|1842->604|1857->610|1953->684|2002->697|2017->703|2119->783|2168->796|2183->802|2292->888|2341->901|2356->907|2456->985|2505->998|2520->1004|2636->1097|2900->1325|2915->1331|3031->1424|3134->1491|3149->1497|3267->1592|3790->2079|3805->2085|3939->2196|4484->2705|4499->2711|4615->2804|5296->3454|5338->3465
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|41->13|41->13|41->13|48->20|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|64->36|64->36|64->36|67->39|67->39|67->39|78->50|78->50|78->50|89->61|89->61|89->61|103->75|105->77
                    -- GENERATED --
                */
            