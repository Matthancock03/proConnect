
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

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/editProfile.css"))),format.raw/*8.78*/("""">

<div class="container-fluid">
	<div class="row clearfix">
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.DbController.saveUser, 'enctype -> "multipart/form-data")/*12.91*/{_display_(Seq[Any](format.raw/*12.92*/("""

		<div class="col-xs-3 column logo-img img-div">

      """),_display_(Seq[Any](/*16.8*/if(userModel.profilePicture != null)/*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.57*/routes/*17.63*/.DbController.getProfilePic(userModel.email))),format.raw/*17.107*/("""" />
      """)))}/*18.8*/else/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*19.71*/routes/*19.77*/.Assets.at("images/profile_holder.png"))),format.raw/*19.116*/("""" />
        """)))})),format.raw/*20.10*/("""
        """),_display_(Seq[Any](/*21.10*/helper/*21.16*/.inputFile(user("profilePicture"), 'class -> "form-control", '_label -> "Upload/Change your profile image" ))),format.raw/*21.124*/("""

    </div>
    <div class="col-xs-1 column">
    </div>
		<div class="col-xs-6 column" style="margin-top: 40px; background-color: #FFFFFF;">
				<div class="form-group break-after">
					 """),_display_(Seq[Any](/*28.8*/helper/*28.14*/.inputText(user("userName"), 'class -> "form-control", '_label -> "Name" ))),format.raw/*28.88*/("""
           """),_display_(Seq[Any](/*29.13*/helper/*29.19*/.inputText(user("email"), 'class -> "form-control", '_label -> "Email Address", 'readonly -> "readonly" ))),format.raw/*29.124*/("""
           """),_display_(Seq[Any](/*30.13*/if(userModel.password == null || userModel.password == "")/*30.71*/{_display_(Seq[Any](format.raw/*30.72*/("""
             """),_display_(Seq[Any](/*31.15*/helper/*31.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password", 'type -> "password"))),format.raw/*31.119*/("""
         """)))}/*32.11*/else/*32.15*/{_display_(Seq[Any](format.raw/*32.16*/("""
             """),_display_(Seq[Any](/*33.15*/helper/*33.21*/.inputText(user("password"), 'class -> "form-control", '_label -> "Password",'type -> "password", 'readonly -> "readonly"))),format.raw/*33.143*/("""
         """)))})),format.raw/*34.11*/("""
           """),_display_(Seq[Any](/*35.13*/helper/*35.19*/.inputText(user("headline"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*35.106*/("""
           """),_display_(Seq[Any](/*36.13*/helper/*36.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*36.97*/("""
           """),_display_(Seq[Any](/*37.13*/helper/*37.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*37.112*/("""
           """),_display_(Seq[Any](/*38.13*/helper/*38.19*/.inputText(user("recentSchool"), 'class -> "form-control", '_label -> "University or Institution"))),format.raw/*38.117*/("""
           """),_display_(Seq[Any](/*39.13*/helper/*39.19*/.checkbox(user("isPremium"), '_label -> "Check here for premium users", 'value -> "true" ))),format.raw/*39.109*/("""
           """),_display_(Seq[Any](/*40.13*/helper/*40.19*/.inputText(user("creditCard"), 'class -> "form-control", '_label -> "Credit Card Number"))),format.raw/*40.108*/("""
           <p>Required for Recruiters - $20 Monthly Fee</p>

				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column" style="background-color: #FFFFFF;">
          <div class="break-after">
            """),_display_(Seq[Any](/*52.14*/helper/*52.20*/.textarea(user("aboutMe"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*52.110*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*55.14*/helper/*55.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Work Experience", 'rows -> "4" ))),format.raw/*55.120*/("""

          </div>
          <div class="break-after">
              """),_display_(Seq[Any](/*59.16*/helper/*59.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*59.133*/("""

            </div>
            <div class="break-after">
                """),_display_(Seq[Any](/*63.18*/helper/*63.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*63.117*/("""

          </div>
          <button type="submit" class="btn save-button pull-right" style="margin-bottom: 15px; background-color:lightgreen;">Save Profile</button>
        </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*70.6*/("""
		</div>
""")))})),format.raw/*72.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 07 00:00:28 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: a3577123dc7a9c86f7f204678205c7fbf2b0e8a4
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1305->182|1407->249|1422->255|1510->334|1549->335|1643->394|1688->430|1727->431|1820->488|1835->494|1902->538|1932->550|1945->554|1984->555|2091->626|2106->632|2168->671|2214->685|2260->695|2275->701|2406->809|2632->1000|2647->1006|2743->1080|2792->1093|2807->1099|2935->1204|2984->1217|3051->1275|3090->1276|3141->1291|3156->1297|3277->1395|3307->1406|3320->1410|3359->1411|3410->1426|3425->1432|3570->1554|3613->1565|3662->1578|3677->1584|3787->1671|3836->1684|3851->1690|3951->1768|4000->1781|4015->1787|4131->1880|4180->1893|4195->1899|4316->1997|4365->2010|4380->2016|4493->2106|4542->2119|4557->2125|4669->2214|5029->2538|5044->2544|5157->2634|5260->2701|5275->2707|5398->2807|5504->2877|5519->2883|5653->2994|5765->3070|5780->3076|5896->3169|6179->3421|6221->3432
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|80->52|80->52|80->52|83->55|83->55|83->55|87->59|87->59|87->59|91->63|91->63|91->63|98->70|100->72
                    -- GENERATED --
                */
            