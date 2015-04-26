
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

"""),_display_(Seq[Any](/*6.2*/main("ProConect")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),_display_(Seq[Any](/*7.2*/navbar/*7.8*/.render)),format.raw/*7.15*/("""

<link rel="stylesheet" href=""""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/editProfile.min.css"))),format.raw/*9.82*/("""">

<div class="container">
  <div class="row clearfix">
    <div class="col-md-3 column">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""

        """)))}/*16.10*/else/*16.14*/{_display_(Seq[Any](format.raw/*16.15*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.DbController.profileMain())),format.raw/*19.52*/("""">
      <button type="button" class="btn btn-default">Edit Profile</button>
    </a>
    </div>
    <div class="col-md-6 column">
      """),_display_(Seq[Any](/*24.8*/if(user.userName != null)/*24.33*/{_display_(Seq[Any](format.raw/*24.34*/("""
            <h3>"""),_display_(Seq[Any](/*25.18*/user/*25.22*/.userName)),format.raw/*25.31*/("""</h3>
          """)))}/*26.12*/else/*26.16*/{_display_(Seq[Any](format.raw/*26.17*/("""
            <h3>Guest</h3>
          """)))})),format.raw/*28.12*/("""

        """),_display_(Seq[Any](/*30.10*/if(user.aboutMe != null)/*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
          <h3>"""),_display_(Seq[Any](/*31.16*/user/*31.20*/.aboutMe)),format.raw/*31.28*/("""</h3>
        """)))})),format.raw/*32.10*/("""

      """),_display_(Seq[Any](/*34.8*/if(user.currentEmployer != null)/*34.40*/{_display_(Seq[Any](format.raw/*34.41*/("""
          <h3>"""),_display_(Seq[Any](/*35.16*/user/*35.20*/.currentEmployer)),format.raw/*35.36*/("""</h3>
        """)))})),format.raw/*36.10*/("""

      """),_display_(Seq[Any](/*38.8*/if(user.location != null)/*38.33*/{_display_(Seq[Any](format.raw/*38.34*/("""
          <h3>"""),_display_(Seq[Any](/*39.16*/user/*39.20*/.location)),format.raw/*39.29*/("""</h3>
        """)))})),format.raw/*40.10*/("""
    </div>
  </div>
  <div class="row clearfix">
      <div class="col-md-12 column">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*48.10*/if(user.aboutMe != null)/*48.34*/{_display_(Seq[Any](format.raw/*48.35*/("""
          <p>
            """),_display_(Seq[Any](/*50.14*/user/*50.18*/.aboutMe)),format.raw/*50.26*/("""
          </p>
        """)))})),format.raw/*52.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*61.8*/if(user.experience != null)/*61.35*/{_display_(Seq[Any](format.raw/*61.36*/("""
      <p>
        """),_display_(Seq[Any](/*63.10*/user/*63.14*/.experience)),format.raw/*63.25*/("""
      </p>
      """)))})),format.raw/*65.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*73.8*/if(user.experience != null)/*73.35*/{_display_(Seq[Any](format.raw/*73.36*/("""
      <p>
        """),_display_(Seq[Any](/*75.10*/user/*75.14*/.projects)),format.raw/*75.23*/("""
      </p>
      """)))})),format.raw/*77.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-12 column">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*85.8*/if(user.experience != null)/*85.35*/{_display_(Seq[Any](format.raw/*85.36*/("""
      <p>
        """),_display_(Seq[Any](/*87.10*/user/*87.14*/.education)),format.raw/*87.24*/("""
      </p>
      """)))})),format.raw/*89.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*93.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 25 17:11:59 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/web-app/app/views/profileEdit.scala.html
                    HASH: 8efc18eacf9f0605962b7f0e16a9ccff975e9568
                    MATRIX: 783->1|909->17|937->36|974->39|999->56|1037->57|1073->59|1086->65|1114->72|1181->104|1195->110|1261->155|1394->253|1434->284|1473->285|1503->296|1516->300|1555->301|1662->372|1677->378|1739->417|1785->431|1840->450|1855->456|1904->483|2077->621|2111->646|2150->647|2204->665|2217->669|2248->678|2284->695|2297->699|2336->700|2407->739|2454->750|2487->774|2526->775|2578->791|2591->795|2621->803|2668->818|2712->827|2753->859|2792->860|2844->876|2857->880|2895->896|2942->911|2986->920|3020->945|3059->946|3111->962|3124->966|3155->975|3202->990|3380->1132|3413->1156|3452->1157|3516->1185|3529->1189|3559->1197|3616->1222|3788->1359|3824->1386|3863->1387|3919->1407|3932->1411|3965->1422|4015->1441|4202->1593|4238->1620|4277->1621|4333->1641|4346->1645|4377->1654|4427->1673|4595->1806|4631->1833|4670->1834|4726->1854|4739->1858|4771->1868|4821->1887|4881->1916
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|37->9|37->9|37->9|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|76->48|76->48|76->48|78->50|78->50|78->50|80->52|89->61|89->61|89->61|91->63|91->63|91->63|93->65|101->73|101->73|101->73|103->75|103->75|103->75|105->77|113->85|113->85|113->85|115->87|115->87|115->87|117->89|121->93
                    -- GENERATED --
                */
            