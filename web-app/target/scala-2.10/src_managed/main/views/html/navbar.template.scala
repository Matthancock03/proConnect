
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*12.38*/routes/*12.44*/.NewsFeed.homeFeed())),format.raw/*12.64*/("""">Proconnect</a>
    </div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*17.21*/routes/*17.27*/.NewsFeed.homeFeed())),format.raw/*17.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.editProfile())),format.raw/*18.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.Application.connections())),format.raw/*19.53*/("""">Connections</a></li>
      <li><a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.MessageController.message())),format.raw/*20.55*/("""">Messages</a></li>
 <li><a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Application.forum())),format.raw/*21.42*/("""">Forums</a></li>

    </ul>
    <form class="navbar-form navbar-left" role="search" action=""""),_display_(Seq[Any](/*24.66*/routes/*24.72*/.SearchController.search())),format.raw/*24.98*/("""">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search For Users" name="searchParameter">
        </div>
        <button type="submit" class="btn btn-default">Search</button>
    </form>
  <ul class="nav navbar-nav">
    <li><a href=""""),_display_(Seq[Any](/*31.19*/routes/*31.25*/.SearchController.search())),format.raw/*31.51*/("""">Advanced Search</a></li>
  </ul>

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href=""""),_display_(Seq[Any](/*39.25*/routes/*39.31*/.Application.help())),format.raw/*39.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*40.25*/routes/*40.31*/.Application.about())),format.raw/*40.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*42.25*/securesocial/*42.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*42.89*/("""">Sign Out</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Mon May 04 13:38:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/navbar.scala.html
                    HASH: be013e656b3cd2ef19b6aa359b438f6e9cb34e64
                    MATRIX: 856->2|1423->533|1438->539|1480->559|1748->791|1763->797|1805->817|1878->854|1893->860|1942->887|2018->927|2033->933|2081->959|2161->1003|2176->1009|2226->1037|2298->1073|2313->1079|2355->1099|2488->1196|2503->1202|2551->1228|2880->1521|2895->1527|2943->1553|3356->1930|3371->1936|3412->1955|3489->1996|3504->2002|3546->2022|3672->2112|3693->2124|3767->2176
=======
                    DATE: Mon May 04 22:14:10 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                    HASH: a873dc03a1ba36962a7e4bde23ac18dfc709b7ff
                    MATRIX: 856->1|1413->522|1428->528|1470->548|1733->775|1748->781|1790->801|1862->837|1877->843|1926->870|2001->909|2016->915|2064->941|2143->984|2158->990|2208->1018|2279->1053|2294->1059|2336->1079|2466->1173|2481->1179|2529->1205|2851->1491|2866->1497|2914->1523|3319->1892|3334->1898|3375->1917|3451->1957|3466->1963|3508->1983|3632->2071|3653->2083|3727->2135
>>>>>>> b3a22e47a1a7935bbebab4765ffc738bee4e6801
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|51->24|51->24|51->24|58->31|58->31|58->31|66->39|66->39|66->39|67->40|67->40|67->40|69->42|69->42|69->42
                    -- GENERATED --
                */
            