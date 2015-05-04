
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main("ProConect")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),_display_(Seq[Any](/*4.2*/navbar/*4.8*/.render)),format.raw/*4.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <button type="button" class="btn btn-success">Compose</button>
			 <br />
				 <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em> Inbox</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em> Sent</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em> Trash</button> <
			</div>
		</div>
		<div class="col-md-6 column">

			<table class="table table-condensed">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
					</tr>
				</thead>
				<tbody>

					"""),_display_(Seq[Any](/*46.7*/for((message, index) <- messages.zipWithIndex) yield /*46.53*/{_display_(Seq[Any](format.raw/*46.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*49.9*/{index + 1})),format.raw/*49.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*52.49*/index)),format.raw/*52.54*/("""">"""),_display_(Seq[Any](/*52.57*/message/*52.64*/.messageTitle)),format.raw/*52.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*55.9*/message/*55.16*/.tstamp)),format.raw/*55.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*58.9*/if(message.isRead)/*58.27*/{_display_(Seq[Any](format.raw/*58.28*/("""
								Read
							""")))}/*60.9*/else/*60.13*/{_display_(Seq[Any](format.raw/*60.14*/("""
								Unread
							""")))})),format.raw/*62.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*66.15*/index)),format.raw/*66.20*/("""" class="collapse">
						<th>Message:</th><td rowspan="3">"""),_display_(Seq[Any](/*67.41*/message/*67.48*/.messageBody)),format.raw/*67.60*/("""</td>
					</tr>

				""")))})),format.raw/*70.6*/("""
				</tbody>
			</table>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-8 column">
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
""")))})),format.raw/*105.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 00:25:35 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: d3646ca7b41750a63e29deb85cdd864a8f3faa4d
                    MATRIX: 783->1|902->26|939->29|964->46|1002->47|1038->49|1051->55|1079->62|2148->1096|2210->1142|2249->1143|2314->1173|2347->1184|2455->1256|2482->1261|2521->1264|2537->1271|2572->1284|2643->1320|2659->1327|2688->1334|2755->1366|2782->1384|2821->1385|2861->1407|2874->1411|2913->1412|2968->1436|3043->1475|3070->1480|3166->1540|3182->1547|3216->1559|3270->1582|3807->2087
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|74->46|74->46|74->46|77->49|77->49|80->52|80->52|80->52|80->52|80->52|83->55|83->55|83->55|86->58|86->58|86->58|88->60|88->60|88->60|90->62|94->66|94->66|95->67|95->67|95->67|98->70|133->105
                    -- GENERATED --
                */
            