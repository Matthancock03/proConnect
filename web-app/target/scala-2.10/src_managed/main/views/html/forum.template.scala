
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
object forum extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Forum],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumItems: List[Forum]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
"""),_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
  """),_display_(Seq[Any](/*3.4*/navbar/*3.10*/.render)),format.raw/*3.17*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3>
				Forums</br ><br />
			</h3>


<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">

			 <button type="button" class="btn btn-success" align="right">New Forum</button><br /><br />

		</div>
		<div class="col-md-6 column">


		</div>
		</div>
	</div>
</div>

	</div>


	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://blog.peertransfer.com/wp-content/uploads/2013/04/Biz-Finding-A-Job-May-Mean-Getting-More-Niche.jpg" width="400" height="400" />
						<div class="caption" width="400" height="400">
							<h3>
								How to Prepare for an Interview
							</h3>
							<p>
								Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.<br /><br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://usajobs.me/wp-content/uploads/2015/03/business-women-success.jpg" />
						<div class="caption" width="400" height="400">
							<h3>
								How to Get a Job With No Experience
							</h3>
							<p>
								Having no experience for a job of your choice will not necessarily eliminate you from being a good candidate. Your dedication, communication skills, and work ethic play a big role. However, in order to stand out you will need to follow a few rules and strategies.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://collegeinformations.com/wp-content/uploads/2012/05/choosing-a-major.jpg" />
						<div class="caption" width="400" height="400">
							<h3>
								5 Tips for Choosing the Right Major
							</h3>
							<p>
								They say choose your passion as your major and you will never have to work a day in your life. While this is true, there is more to knowing what major is right for you.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://blog.nextsociety.com/wp-content/uploads/2014/09/entrepreneurship-networking-advice-1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								How to Grow your Network
							</h3>
							<p>
								Whether you want to grow your business or get an entry job position, networking is one of the many crucial factors which you should practice like any other skill to master it.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="https://media.licdn.com/mpr/mpr/p/8/005/081/32b/3e3556e.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								10 Steps to Starting a Business
							</h3>
							<p>
								Starting a business involves a lot of research, financial investment, and going through a series of legal work. These 10 steps can help you get your business started as well as prepare and manage your business.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://gomdl.com/wp-content/uploads/2013/03/Student-Studying.jpg"/>
						<div class="caption" width="400" height="400">
							<h3>
								Study Tips
							</h3>
							<p>
								Wondering why the all nighter before your final exam did not pay off and did not get you the grade you hoped for? Need to know how to study effectively? Then look no further. Any student can benefit from these tips and techniques.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://www.unomaha.edu/college-of-business-administration/finance-banking-real-estate/_files/images/finance1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								Beginner's Guide to Managing Your Finances
							</h3>
							<p>
								Whether you want to admit it or not, money is a huge part of your life nowadays, thus knowing how to manage it will help you take controlof your life and get you ahead financially and socially.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://higherperspective.com/wp-content/uploads/2014/12/Successful-Business-Risk.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								3 Ways to be More Successful
							</h3>
							<p>
								It's human nature to desire success no matter where they are in life. However, it's easier said than done, hence not a lot of people are willing to do what is necessary to reach success.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="https://venkyias.files.wordpress.com/2012/08/discussion1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								General Discussion
							</h3>
							<p>
								If you cannot find the forum looking for, you can either create your own forum or try this one. You can find a wide variety of topics and questions in this forum.<br /><br /><br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<br /><br />
		</div>
	</div>


""")))})),format.raw/*188.2*/("""
"""))}
    }
    
    def render(forumItems:List[Forum]): play.api.templates.HtmlFormat.Appendable = apply(forumItems)
    
    def f:((List[Forum]) => play.api.templates.HtmlFormat.Appendable) = (forumItems) => apply(forumItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 21:11:14 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forum.scala.html
                    HASH: bccbbfdf9d2962a3c1f38046e07a4bba330e297c
                    MATRIX: 779->1|898->26|934->28|960->46|998->47|1036->51|1050->57|1078->64|7424->6378
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|216->188
                    -- GENERATED --
                */
            