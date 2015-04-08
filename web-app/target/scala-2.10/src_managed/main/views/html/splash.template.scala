
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
object splash extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*2.31*/routes/*2.37*/.Assets.at("stylesheets/splash.min.css"))),format.raw/*2.77*/("""">

<div class="container-fluid">


	<div class="row clearfix topSplash">
    <!--<nav class="navbar navbar-inverse">
  				<div class="navbar-header">
  					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
  						<span class="sr-only">Toggle navigation</span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  					</button>
  					<a class="navbar-brand" href="#">ProConnect</a>
  				</div>
  				<div id="navbar" class="collapse navbar-collapse">
  			</div>
  		</nav> -->

  		<div class="col-xs-3 column">
  		</div>
      <div class="col-xs-6 column" style="padding-top: 25px;">
				<div class="carousel slide" id="carousel-13062">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0" data-target="#carousel-13062">
						</li>
						<li data-slide-to="1" data-target="#carousel-13062">
						</li>
						<li data-slide-to="2" data-target="#carousel-13062">
						</li>
					</ol>
					<div class="carousel-inner">
						<div class="item">
							<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*36.62*/routes/*36.68*/.Assets.at("images/Networking.jpg"))),format.raw/*36.103*/("""" />
							<div class="carousel-caption">
								<h4>
									Engage Your Peers
								</h4>
							</div>
						</div>
						<div class="item">
							<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*44.62*/routes/*44.68*/.Assets.at("images/business2.jpg"))),format.raw/*44.102*/("""" />
							<div class="carousel-caption">
								<h4>
									Get Connected
								</h4>
							</div>
						</div>
						<div class="item active">
							<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*52.62*/routes/*52.68*/.Assets.at("images/proConnect.jpg"))),format.raw/*52.103*/("""" />
							<div class="carousel-caption">
								<h4>
									ProConnect
								</h4>
							</div>
						</div>
					</div> <a class="left carousel-control" href="#carousel-13062" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-13062" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
        <!-- <h1 class ="header-text text-center">ProConnect</h1>
        <h3 class="text-center top-text">A New Way To Connect</h3> -->

  		</div>
  		<div class="col-xs-3 column">
  		</div>
	</div>
	<div class="row clearfix bottomSplash">
  		<div class="col-xs-3 column text-div">
        <!-- <image class="logo-img " src=""""),_display_(Seq[Any](/*70.45*/routes/*70.51*/.Assets.at("images/proConnect.jpg"))),format.raw/*70.86*/(""""> -->

  		</div>
      <div class="col-xs-6 column">
        <h3 class="text-center bottom-text">Come meet all the professionals already exploring
          what ProConnect has to offer. Take your professional network to the next level and
          get connected in a way you never thought possible.</h3>
        <a href=""""),_display_(Seq[Any](/*77.19*/securesocial/*77.31*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*77.82*/("""">
          <button class="btn center-block connect-button btn-lg">Get Connected</button>
        </a>
  		</div>
  		<div class="col-xs-3 column">
  		</div>
	</div>
</div>
""")))})),format.raw/*85.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 07 21:54:31 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/splash.scala.html
                    HASH: e3e9ba9008b03247f804df1137799a25039243bf
                    MATRIX: 865->1|891->19|929->20|995->51|1009->57|1070->97|2310->1301|2325->1307|2383->1342|2629->1552|2644->1558|2701->1592|2950->1805|2965->1811|3023->1846|3797->2584|3812->2590|3869->2625|4231->2951|4252->2963|4325->3014|4532->3190
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|64->36|64->36|64->36|72->44|72->44|72->44|80->52|80->52|80->52|98->70|98->70|98->70|105->77|105->77|105->77|113->85
                    -- GENERATED --
                */
            