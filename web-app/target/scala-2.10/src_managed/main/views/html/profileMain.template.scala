
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
		<div class="col-xs-6 column" style="margin-top: 40px;">
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
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
            """),_display_(Seq[Any](/*47.14*/helper/*47.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "About Me", 'rows -> "4" ))),format.raw/*47.113*/("""
          </div>
          <div class="break-after">
            """),_display_(Seq[Any](/*50.14*/helper/*50.20*/.textarea(user("experience"), 'class -> "form-control", '_label -> "Experience", 'rows -> "4" ))),format.raw/*50.115*/("""
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
              """),_display_(Seq[Any](/*61.16*/helper/*61.22*/.textarea(user("projects"), 'class -> "form-control", '_label -> "Projects Or Skills Highlight", 'rows -> "4" ))),format.raw/*61.133*/("""
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
                """),_display_(Seq[Any](/*73.18*/helper/*73.24*/.textarea(user("education"), 'class -> "form-control", '_label -> "Education", 'rows -> "4" ))),format.raw/*73.117*/("""
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
    """)))})),format.raw/*88.6*/("""
		</div>
""")))})),format.raw/*90.2*/("""
"""))}
    }
    
    def render(user:Form[UserModel],userModel:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user,userModel)
    
    def f:((Form[UserModel],UserModel) => play.api.templates.HtmlFormat.Appendable) = (user,userModel) => apply(user,userModel)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sun May 03 18:04:20 PDT 2015
=======
<<<<<<< HEAD
                    DATE: Sat May 02 15:10:06 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 788379aba52e7ef6494375a68e167cd299f1dad4
                    MATRIX: 799->1|955->46|985->68|1022->71|1048->89|1086->90|1125->95|1139->101|1167->108|1236->142|1250->148|1316->193|1422->264|1437->270|1525->349|1564->350|1662->413|1707->449|1746->450|1840->508|1855->514|1922->558|1953->571|1966->575|2005->576|2113->648|2128->654|2190->693|2237->708|2284->719|2299->725|2430->833|2636->1004|2651->1010|2747->1084|2797->1098|2812->1104|2940->1209|2990->1223|3057->1281|3096->1282|3148->1298|3163->1304|3284->1402|3315->1414|3328->1418|3367->1419|3419->1435|3434->1441|3579->1563|3623->1575|3673->1589|3688->1595|3797->1681|3847->1695|3862->1701|3962->1779|4012->1793|4027->1799|4143->1892|4417->2130|4432->2136|4548->2229|4654->2299|4669->2305|4787->2400|5347->2924|5362->2930|5496->3041|6090->3599|6105->3605|6221->3698|6932->4378|6976->4391
=======
<<<<<<< HEAD
                    DATE: Sat May 02 15:50:34 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: df71d510e723b0ee7a64d35c7132cff5322e8b32
                    MATRIX: 799->1|955->46|985->68|1022->71|1048->89|1086->90|1125->95|1139->101|1167->108|1236->142|1250->148|1316->193|1540->381|1555->387|1617->426|1887->661|2023->787|2063->788|2169->863|2213->872|2228->878|2281->922|2320->923|2406->974|2421->980|2517->1054|2567->1068|2582->1074|2710->1179|2760->1193|2839->1263|2878->1264|3006->1356|3021->1362|3142->1460|3173->1472|3186->1476|3225->1477|3275->1491|3290->1497|3435->1619|3479->1631|3529->1645|3544->1651|3653->1737|3703->1751|3718->1757|3818->1835|3868->1849|3883->1855|3999->1948|4273->2186|4288->2192|4404->2285|4510->2355|4525->2361|4643->2456|5203->2980|5218->2986|5352->3097|5946->3655|5961->3661|6077->3754|6788->4434|6832->4447
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|42->14|42->14|42->14|49->21|49->21|49->21|51->23|52->24|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|74->46|74->46|74->46|77->49|77->49|77->49|88->60|88->60|88->60|100->72|100->72|100->72|115->87|117->89
=======
                    DATE: Sat May 02 13:10:10 PDT 2015
>>>>>>> 8f8ae877319c134aee014bdb30a07b08ec040e35
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 4549c3e614e468ee7e9c97b4ac2065819c2a160a
                    MATRIX: 799->1|954->46|982->65|1018->67|1044->85|1082->86|1120->90|1134->96|1162->103|1229->135|1243->141|1309->186|1411->253|1426->259|1514->338|1553->339|1647->398|1692->434|1731->435|1824->492|1839->498|1906->542|1936->554|1949->558|1988->559|2095->630|2110->636|2172->675|2218->689|2264->699|2279->705|2410->813|2609->977|2624->983|2720->1057|2769->1070|2784->1076|2912->1181|2961->1194|3028->1252|3067->1253|3118->1268|3133->1274|3254->1372|3284->1383|3297->1387|3336->1388|3387->1403|3402->1409|3547->1531|3590->1542|3639->1555|3654->1561|3763->1647|3812->1660|3827->1666|3927->1744|3976->1757|3991->1763|4107->1856|4371->2084|4386->2090|4502->2183|4605->2250|4620->2256|4738->2351|5287->2864|5302->2870|5436->2981|6018->3527|6033->3533|6149->3626|6845->4291|6887->4302
>>>>>>> b5cd3ede55911f15f7cd40c3fa35efc022e62ba8
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|40->12|40->12|40->12|40->12|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|75->47|75->47|75->47|78->50|78->50|78->50|89->61|89->61|89->61|101->73|101->73|101->73|116->88|118->90
                    -- GENERATED --
                */
            