
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

    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column">
        """),_display_(Seq[Any](/*34.10*/if(user.aboutMe != null)/*34.34*/{_display_(Seq[Any](format.raw/*34.35*/("""
          <h3>"""),_display_(Seq[Any](/*35.16*/user/*35.20*/.aboutMe)),format.raw/*35.28*/("""</h3>
        """)))})),format.raw/*36.10*/("""

      """),_display_(Seq[Any](/*38.8*/if(user.currentEmployer != null)/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""
          <h3>"""),_display_(Seq[Any](/*39.16*/user/*39.20*/.currentEmployer)),format.raw/*39.36*/("""</h3>
        """)))})),format.raw/*40.10*/("""

      """),_display_(Seq[Any](/*42.8*/if(user.location != null)/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""
          <h3>"""),_display_(Seq[Any](/*43.16*/user/*43.20*/.location)),format.raw/*43.29*/("""</h3>
        """)))})),format.raw/*44.10*/("""
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
        """),_display_(Seq[Any](/*56.10*/if(user.aboutMe != null)/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
          <p>
            """),_display_(Seq[Any](/*58.14*/user/*58.18*/.aboutMe)),format.raw/*58.26*/("""
          </p>
        """)))})),format.raw/*60.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*72.8*/if(user.experience != null)/*72.35*/{_display_(Seq[Any](format.raw/*72.36*/("""
      <p>
        """),_display_(Seq[Any](/*74.10*/user/*74.14*/.experience)),format.raw/*74.25*/("""
      </p>
      """)))})),format.raw/*76.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*87.8*/if(user.experience != null)/*87.35*/{_display_(Seq[Any](format.raw/*87.36*/("""
      <p>
        """),_display_(Seq[Any](/*89.10*/user/*89.14*/.projects)),format.raw/*89.23*/("""
      </p>
      """)))})),format.raw/*91.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*102.8*/if(user.experience != null)/*102.35*/{_display_(Seq[Any](format.raw/*102.36*/("""
      <p>
        """),_display_(Seq[Any](/*104.10*/user/*104.14*/.education)),format.raw/*104.24*/("""
      </p>
      """)))})),format.raw/*106.8*/("""
    </div>
  </div>


  <div class="row clearfix">
    <div class="col-md-12 column">
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        h3. Lorem ipsum dolor sit amet.
      </h3>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-2 column">
    </div>
    <div class="col-md-6 column">
    </div>
    <div class="col-md-4 column">
      <ul class="pagination">
        <li>
          <a href="#">Prev</a>
        </li>
        <li>
          <a href="#">1</a>
        </li>
        <li>
          <a href="#">2</a>
        </li>
        <li>
          <a href="#">3</a>
        </li>
        <li>
          <a href="#">4</a>
        </li>
        <li>
          <a href="#">5</a>
        </li>
        <li>
          <a href="#">Next</a>
        </li>
      </ul>
    </div>
  </div>



</div>
""")))})),format.raw/*193.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Mon May 04 00:51:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 3db81c16dd145c2a92c5c5a65c44c3d197b50d54
                    MATRIX: 783->1|910->17|940->39|1007->71|1021->77|1083->118|1124->125|1149->142|1187->143|1224->146|1237->152|1265->159|1411->270|1451->301|1490->302|1584->360|1599->366|1661->405|1692->418|1705->422|1744->423|1852->495|1867->501|1929->540|1976->555|2023->566|2057->591|2096->592|2153->613|2166->617|2197->626|2236->646|2249->650|2288->651|2365->696|2419->714|2434->720|2483->747|2770->998|2803->1022|2842->1023|2895->1040|2908->1044|2938->1052|2986->1068|3032->1079|3073->1111|3112->1112|3165->1129|3178->1133|3216->1149|3264->1165|3310->1176|3344->1201|3383->1202|3436->1219|3449->1223|3480->1232|3528->1248|3789->1473|3822->1497|3861->1498|3927->1528|3940->1532|3970->1540|4029->1567|4251->1754|4287->1781|4326->1782|4384->1804|4397->1808|4430->1819|4482->1840|4718->2041|4754->2068|4793->2069|4851->2091|4864->2095|4895->2104|4947->2125|5165->2307|5202->2334|5242->2335|5301->2357|5315->2361|5348->2371|5401->2392|7421->4380
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|84->56|84->56|84->56|86->58|86->58|86->58|88->60|100->72|100->72|100->72|102->74|102->74|102->74|104->76|115->87|115->87|115->87|117->89|117->89|117->89|119->91|130->102|130->102|130->102|132->104|132->104|132->104|134->106|221->193
=======
                    DATE: Mon May 04 00:25:35 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: a7632cab023d4b4ea58bf0a555f2e3d69aa28804
                    MATRIX: 783->1|909->17|937->36|1003->67|1017->73|1079->114|1118->119|1143->136|1181->137|1217->139|1230->145|1258->152|1398->257|1438->288|1477->289|1570->346|1585->352|1647->391|1677->403|1690->407|1729->408|1836->479|1851->485|1913->524|1959->538|2005->548|2039->573|2078->574|2134->594|2147->598|2178->607|2216->626|2229->630|2268->631|2343->674|2396->691|2411->697|2460->724|2737->965|2770->989|2809->990|2861->1006|2874->1010|2904->1018|2951->1033|2995->1042|3036->1074|3075->1075|3127->1091|3140->1095|3178->1111|3225->1126|3269->1135|3303->1160|3342->1161|3394->1177|3407->1181|3438->1190|3485->1205|3734->1418|3767->1442|3806->1443|3870->1471|3883->1475|3913->1483|3970->1508|4180->1683|4216->1710|4255->1711|4311->1731|4324->1735|4357->1746|4407->1765|4632->1955|4668->1982|4707->1983|4763->2003|4776->2007|4807->2016|4857->2035|5064->2206|5101->2233|5141->2234|5198->2254|5212->2258|5245->2268|5296->2287|5357->2316
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|84->56|84->56|84->56|86->58|86->58|86->58|88->60|100->72|100->72|100->72|102->74|102->74|102->74|104->76|115->87|115->87|115->87|117->89|117->89|117->89|119->91|130->102|130->102|130->102|132->104|132->104|132->104|134->106|138->110
>>>>>>> ae23faaf008a25c9f65ddb9de81e5657111bde05
                    -- GENERATED --
                */
            