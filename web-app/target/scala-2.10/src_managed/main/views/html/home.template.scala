
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

<div class="container-fluid">
	<div class="row clearfix">
		"""),_display_(Seq[Any](/*7.4*/navbar/*7.10*/.render())),format.raw/*7.19*/("""
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
						<img alt="" src=""""),_display_(Seq[Any](/*44.25*/routes/*44.31*/.Assets.at("images/businessImage1.jpg"))),format.raw/*44.70*/("""" />
						<div class="carousel-caption">
							<h4>
								Engage Your Peers
							</h4>
						</div>
					</div>
					<div class="item">
						<img alt="" src=""""),_display_(Seq[Any](/*52.25*/routes/*52.31*/.Assets.at("images/business2.jpg"))),format.raw/*52.65*/("""" />
						<div class="carousel-caption">
							<h4>
								Get Connected
							</h4>
						</div>
					</div>
					<div class="item">
						<img alt="" src=""""),_display_(Seq[Any](/*60.25*/routes/*60.31*/.Assets.at("images/proConnect.jpg"))),format.raw/*60.66*/("""" />
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
				  <div class="panel-heading tweetHeader">Twitter Feed</div>
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
""")))})),format.raw/*156.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 01 20:54:49 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                    HASH: 9c8fc56229c10c2401aea87e45f97cb7e0a8dba5
                    MATRIX: 870->17|906->19|932->37|971->39|1068->102|1082->108|1112->117|2031->1000|2046->1006|2107->1045|2309->1211|2324->1217|2380->1251|2578->1413|2593->1419|2650->1454|5441->4213
                    LINES: 30->2|31->3|31->3|31->3|35->7|35->7|35->7|72->44|72->44|72->44|80->52|80->52|80->52|88->60|88->60|88->60|184->156
                    -- GENERATED --
                */
            