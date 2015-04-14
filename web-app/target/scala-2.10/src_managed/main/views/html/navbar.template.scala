
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
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*13.38*/routes/*13.44*/.DbController.home())),format.raw/*13.64*/("""">Proconnect</a>
    </div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.home())),format.raw/*18.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.DbController.editProfile())),format.raw/*19.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Application.connections())),format.raw/*20.53*/("""">Connections</a></li>
 <li><a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Application.forum())),format.raw/*21.42*/("""">Forums</a></li>
    </ul>
    """),_display_(Seq[Any](/*23.6*/helper/*23.12*/.form(action = routes.Application.search(), 'class -> "navbar-form navbar-left")/*23.92*/ {_display_(Seq[Any](format.raw/*23.94*/("""
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search" name="query" id="query">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
      """)))})),format.raw/*28.8*/("""
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href=""""),_display_(Seq[Any](/*34.25*/routes/*34.31*/.Application.help())),format.raw/*34.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*35.25*/routes/*35.31*/.Application.about())),format.raw/*35.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*37.25*/securesocial/*37.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*37.89*/("""">Sign Out</a></li>
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
                    DATE: Tue Apr 14 10:24:33 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/navbar.scala.html
                    HASH: bdff0adeab4a237650e77eca169ac096669316dc
                    MATRIX: 873->18|1442->551|1457->557|1499->577|1767->809|1782->815|1824->835|1897->872|1912->878|1961->905|2037->945|2052->951|2100->977|2175->1016|2190->1022|2232->1042|2302->1077|2317->1083|2406->1163|2446->1165|2696->1384|3072->1724|3087->1730|3128->1749|3205->1790|3220->1796|3262->1816|3388->1906|3409->1918|3483->1970
                    LINES: 30->2|41->13|41->13|41->13|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|51->23|56->28|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37
                    -- GENERATED --
                */
            