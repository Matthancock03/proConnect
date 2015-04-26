
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[UserModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Form[UserModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.25*/("""

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
    
    def render(user:Form[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((Form[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 25 17:11:58 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/web-app/app/views/profileMain.scala.html
                    HASH: e18670edecb6452e94f24eacc66afc5daff19f1b
                    MATRIX: 789->1|922->24|950->43|986->45|1012->63|1050->64|1088->68|1102->74|1130->81|1347->262|1362->268|1424->307|1661->509|1676->515|1729->559|1768->560|1852->609|1867->615|1963->689|2012->702|2027->708|2129->788|2178->801|2193->807|2302->893|2351->906|2366->912|2466->990|2515->1003|2530->1009|2646->1102|2910->1330|2925->1336|3041->1429|3144->1496|3159->1502|3277->1597|3800->2084|3815->2090|3949->2201|4494->2710|4509->2716|4625->2809|5306->3459|5348->3470
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|41->13|41->13|41->13|48->20|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|64->36|64->36|64->36|67->39|67->39|67->39|78->50|78->50|78->50|89->61|89->61|89->61|103->75|105->77
                    -- GENERATED --
                */
            