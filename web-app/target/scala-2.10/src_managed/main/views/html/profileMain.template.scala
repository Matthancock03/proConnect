
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[UserModel],UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Form[UserModel], userModel: UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/{_display_(Seq[Any](format.raw/*5.21*/("""
  """),_display_(Seq[Any](/*6.4*/navbar/*6.10*/.render)),format.raw/*6.17*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*8.82*/("""">

<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-xs-2 column logo-img img-div">

        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*14.71*/routes/*14.77*/.Assets.at("images/profile_holder.png"))),format.raw/*14.116*/("""" />

        <label for="exampleInputFile">Profile Image</label><input type="file" id="exampleInputFile" />
		</div>
    <div class="col-xs-2 column">
    </div>
		<div class="col-xs-6 column" style="margin-top: 40px;">
      """),_display_(Seq[Any](/*21.8*/if(userModel.password == null || userModel.password == "None Entered" || userModel.aboutMe == null || userModel.aboutMe == "")/*21.134*/{_display_(Seq[Any](format.raw/*21.135*/("""
        <h2>Please input some data and let's get Connected!</h2>
      """)))})),format.raw/*23.8*/("""
      """),_display_(Seq[Any](/*24.8*/helper/*24.14*/.form(action = routes.DbController.saveUser)/*24.58*/{_display_(Seq[Any](format.raw/*24.59*/("""
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*26.8*/helper/*26.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*26.88*/("""
           """),_display_(Seq[Any](/*27.13*/helper/*27.19*/.inputText(user("email"), 'class -> "form-control", '_label -> "Email Address", 'readonly -> "readonly" ))),format.raw/*27.124*/("""
           """),_display_(Seq[Any](/*28.13*/if(userModel.password == null || userModel.password == "None Entered")/*28.83*/{_display_(Seq[Any](format.raw/*28.84*/("""
            <h3>Please enter a password to associate with your account.</h3>
           """),_display_(Seq[Any](/*30.13*/helper/*30.19*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password", 'type -> "password"))),format.raw/*30.117*/("""
         """)))}/*31.11*/else/*31.15*/{_display_(Seq[Any](format.raw/*31.16*/("""
           """),_display_(Seq[Any](/*32.13*/helper/*32.19*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password",'type -> "password", 'readonly -> "readonly"))),format.raw/*32.141*/("""
         """)))})),format.raw/*33.11*/("""
           """),_display_(Seq[Any](/*34.13*/helper/*34.19*/.inputText(user("aboutMe"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*34.105*/("""
           """),_display_(Seq[Any](/*35.13*/helper/*35.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*35.97*/("""
           """),_display_(Seq[Any](/*36.13*/helper/*36.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*36.112*/("""
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
            """),_display_(Seq[Any](/*46.14*/helper/*46.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*46.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*49.14*/helper/*49.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*49.115*/("""
            <div>
              <button type="button" class="btn btn-info pull-right btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
              </button>
            <button type="button" class="btn btn-danger pull-right btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
            </button>
          </div>
          </div>
          <div class="break-after">
              """),_display_(Seq[Any](/*60.16*/helper/*60.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*60.133*/("""
              <div>
                <button type="button" class="btn btn-info btn-xs pull-right" aria-label="right Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-danger btn-xs pull-right" aria-label="right Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>

              </div>
            </div>
            <div class="break-after">
                """),_display_(Seq[Any](/*72.18*/helper/*72.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*72.117*/("""
                <div>
                  <button type="button" class="btn btn-info pull-right btn-xs" aria-label="left Align">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                  </button>
                <button type="button" class="btn btn-danger pull-right  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>

              </div>
          </div>
          <button type="submit" class="btn save-button pull-right">Submit</button>
        </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*87.6*/("""
		</div>
""")))})),format.raw/*89.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 29 20:14:23 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/web-app/app/views/profileMain.scala.html
                    HASH: 1d2a4be993e8c4d7a2301d37808ced27bc9b116a
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1309->186|1527->368|1542->374|1604->413|1867->641|2003->767|2043->768|2147->841|2190->849|2205->855|2258->899|2297->900|2381->949|2396->955|2492->1029|2541->1042|2556->1048|2684->1153|2733->1166|2812->1236|2851->1237|2977->1327|2992->1333|3113->1431|3143->1442|3156->1446|3195->1447|3244->1460|3259->1466|3404->1588|3447->1599|3496->1612|3511->1618|3620->1704|3669->1717|3684->1723|3784->1801|3833->1814|3848->1820|3964->1913|4228->2141|4243->2147|4359->2240|4462->2307|4477->2313|4595->2408|5144->2921|5159->2927|5293->3038|5875->3584|5890->3590|6006->3683|6702->4348|6744->4359
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|42->14|42->14|42->14|49->21|49->21|49->21|51->23|52->24|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|74->46|74->46|74->46|77->49|77->49|77->49|88->60|88->60|88->60|100->72|100->72|100->72|115->87|117->89
                    -- GENERATED --
                */
            