
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
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.DbController.saveUser, 'enctype -> "multipart/form-data")/*12.91*/{_display_(Seq[Any](format.raw/*12.92*/("""

		<div class="col-xs-2 column logo-img img-div">

      """),_display_(Seq[Any](/*16.8*/if(userModel.profilePicture != null)/*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.57*/routes/*17.63*/.DbController.getProfilePic(userModel.email))),format.raw/*17.107*/("""" />
      """)))}/*18.8*/else/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*19.71*/routes/*19.77*/.Assets.at("images/profile_holder.png"))),format.raw/*19.116*/("""" />
        """)))})),format.raw/*20.10*/("""
        """),_display_(Seq[Any](/*21.10*/helper/*21.16*/.inputFile(user("profilePicture"), 'class -> "form-control", '_label -> "Upload/Change your profile image" ))),format.raw/*21.124*/("""

    </div>
    <div class="col-xs-2 column">
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
           """),_display_(Seq[Any](/*35.13*/helper/*35.19*/.inputText(user("aboutMe"), 'class -> "form-control", '_label -> "Personal Headline" ))),format.raw/*35.105*/("""
           """),_display_(Seq[Any](/*36.13*/helper/*36.19*/.inputText(user("location"), 'class -> "form-control", '_label -> "Location" ))),format.raw/*36.97*/("""
           """),_display_(Seq[Any](/*37.13*/helper/*37.19*/.inputText(user("currentEmployer"), 'class -> "form-control", '_label -> "Current Employer" ))),format.raw/*37.112*/("""

           """),_display_(Seq[Any](/*39.13*/helper/*39.19*/.checkbox(user("isPremium"), '_label -> "Check here for premium users"))),format.raw/*39.90*/("""
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
            """),_display_(Seq[Any](/*52.14*/helper/*52.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*52.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*55.14*/helper/*55.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*55.115*/("""
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
              """),_display_(Seq[Any](/*66.16*/helper/*66.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*66.133*/("""
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
                """),_display_(Seq[Any](/*78.18*/helper/*78.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*78.117*/("""
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
    """)))})),format.raw/*93.6*/("""
		</div>
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 12:53:41 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 9fae047428fc26f1662d408376afd4b767942d4e
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1309->186|1411->253|1426->259|1514->338|1553->339|1647->398|1692->434|1731->435|1824->492|1839->498|1906->542|1936->554|1949->558|1988->559|2095->630|2110->636|2172->675|2218->689|2264->699|2279->705|2410->813|2636->1004|2651->1010|2747->1084|2796->1097|2811->1103|2939->1208|2988->1221|3055->1279|3094->1280|3145->1295|3160->1301|3281->1399|3311->1410|3324->1414|3363->1415|3414->1430|3429->1436|3574->1558|3617->1569|3666->1582|3681->1588|3790->1674|3839->1687|3854->1693|3954->1771|4003->1784|4018->1790|4134->1883|4184->1897|4199->1903|4292->1974|4341->1987|4356->1993|4468->2082|4828->2406|4843->2412|4959->2505|5062->2572|5077->2578|5195->2673|5744->3186|5759->3192|5893->3303|6475->3849|6490->3855|6606->3948|7302->4613|7344->4624
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|80->52|80->52|80->52|83->55|83->55|83->55|94->66|94->66|94->66|106->78|106->78|106->78|121->93|123->95
                    -- GENERATED --
                */
            