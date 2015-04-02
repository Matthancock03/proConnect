
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.32*/routes/*4.38*/.Assets.at("stylesheets/home.min.css"))),format.raw/*4.76*/("""">


<div class="container-fluid">
	<div class="row clearfix">
		"""),_display_(Seq[Any](/*9.4*/navbar/*9.10*/.render())),format.raw/*9.19*/("""
	</div>

	<div class="row clearfix">
		<div class="col-xs-12 column">
		</div>
	</div>

	<div class="row clearfix">
		<div class="col-xs-2 column">
			<img alt="140x140" class = "img-thumbnail profileImage" src="http://i.imgur.com/PcoAz60.jpg?1" />

			<dl class="dl-horizontal">
				<dt>
					Matthew Hancock
				</dt>
				<dd>
					Beyond Prosthetics
				</dd>
				<dd>
					San Jose State University
				</dd>
			</dl>
		</div>

		<div class="col-xs-6 column clearfix">
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
					<div class="item active">
						<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*46.61*/routes/*46.67*/.Assets.at("images/businessImage1.jpg"))),format.raw/*46.106*/("""" />
						<div class="carousel-caption">
							<h4>
								Engage Your Peers
							</h4>
						</div>
					</div>
					<div class="item">
						<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*54.61*/routes/*54.67*/.Assets.at("images/business2.jpg"))),format.raw/*54.101*/("""" />
						<div class="carousel-caption">
							<h4>
								Get Connected
							</h4>
						</div>
					</div>
					<div class="item">
						<img class="img-responsive center-block" alt="" src=""""),_display_(Seq[Any](/*62.61*/routes/*62.67*/.Assets.at("images/proConnect.jpg"))),format.raw/*62.102*/("""" />
						<div class="carousel-caption">
							<h4>
								ProConnect
							</h4>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-13062" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-13062" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<div class="col-xs-4 column">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
				  </div>
				</div>
			</div>
		</div>


		</div>
	<div class="row clearfix">
		<div class="col-xs-6 column">
			<h2>
				Heading
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				<a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-xs-6 column">
			<h2>
				Heading
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				<a class="btn" href="#">View details »</a>
			</p>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
	</div>
	<div class="row clearfix">
	</div>
  </div>
</div>
""")))})),format.raw/*158.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 02 09:39:46 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 83aa004a45e850f666452cd24513a7e0d23d8584
                    MATRIX: 870->17|906->19|932->37|971->39|1038->71|1052->77|1111->115|1211->181|1225->187|1255->196|2210->1115|2225->1121|2287->1160|2525->1362|2540->1368|2597->1402|2831->1600|2846->1606|2904->1641|5683->4388
                    LINES: 30->2|31->3|31->3|31->3|32->4|32->4|32->4|37->9|37->9|37->9|74->46|74->46|74->46|82->54|82->54|82->54|90->62|90->62|90->62|186->158
                    -- GENERATED --
                */
            