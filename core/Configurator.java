<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html id="html">
    <head>
        <title>GC: Configurator - com.android.uiautomator.core.Configurator (.java) - GrepCode Class Source</title>
        <meta name="verify-v1" content="oDbHfknRLVnvs+1b/O61iSxPEhVr3O08Fd3QqJ1cGh8="/>
        <meta name="verify-v1" content="d2G+nnw2Xr6jBfde7yNvdZirW9Y6K0fa+56zhEmm6YA="/>
        <meta name="msvalidate.01" content="62B5A32F828BC27E3852FB825A5156E4" />
        <meta name="description" content="com.android.uiautomator.core.Configurator - Allows you to set key parameters for running uiautomator tests"/>
        <meta property="fb:app_id" content="143989634057"/>
        <link rel="canonical" href="http://grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java?av=f"/>
        <link rel="search" type="application/opensearchdescription+xml" title="grepcode.com" href="/static/app/grepcodeosd.xml"/>
        <link rel="icon" type="image/x-icon" href="/static/app/images/favicon.ico"/>

        <link href="/static/app/stylesheet/site.css" rel="stylesheet" type="text/css"/>
        <link href="/static/app/stylesheet/images-sprite.css" rel="stylesheet" type="text/css"/>
        <link href="/static/app/stylesheet/images-site-sprite.css" rel="stylesheet" type="text/css"/>

        <!-- always need these -->
        <script type="text/javascript" src="/static/app/javascript/always.js"></script>

        
        
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/treeview/assets/folders.css"/>
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/logger/assets/skins/sam/logger.css"/>
            <link rel="stylesheet" type="text/css" href="/static/app/libs/yui/tabview/assets/skins/sam/tabview.css"/>

            <script type="text/javascript" src="/static/app/javascript/yui2.js"></script>
        

        
        
            <script type="text/javascript" src="/static/app/javascript/grepcode.js"></script>
        

        
        
    
<script id="com-grepcode-web-entity-snapshot-ProjectSnapshotChooser-0">
function showSiblings(tLink) {
    var sDiv = tLink.nextSibling;
    while (sDiv.nodeType != 1) { sDiv = sDiv.nextSibling; }

    if (sDiv.style.visibility == "visible") {
        sDiv.style.visibility = "hidden";
    } else {
        var x = getPageOffsetLeft(tLink) - 7;
        var y = getPageOffsetTop(tLink) + tLink.offsetHeight + 5;
        sDiv.style.left = x + "px";
        sDiv.style.top = y + "px";
        sDiv.style.visibility = "visible";
    }
}
</script>
</head>

    <body>
        <div id="header">
            <div class="head-search">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <div>
    <div class="search-panel">
        <form action="/search">
            <span id="query-container">
                <input id="search-field" type="text" name="query" value=""/>
            </span>
            <input type="hidden" name="n" value=""></input>
            <input type="submit" value="Search"/>
            <span id="search-field-focus-flag" style="display:none;">false</span>
        </form>
    </div>
    <script>
    YAHOO.util.Event.onDOMReady(function() {
        var flag = document.getElementById("search-field-focus-flag");
        if (flag && flag.innerHTML === 'true') {
            document.getElementById("search-field").focus();
        }
    }, null, true)
    </script>
</div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="logo">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <a href="/"><img src="/static/app/images/logo-rel.gif" alt="Logo" width="200" height="50"/></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="head-menu head-menu-width">
                <div class="head-outer">
                    <div class="head-middle">
                        <div class="head-inner">
                            <span>
			                <a href="/?st=true">Stack Trace Search</a> |
                            </span>
                            <span>
                            <a href="/eclipse">Eclipse</a> |
                            <a href="/intellij">IntelliJ</a> |
                            <a href="/contact">Contact</a> |
                            <a href="/faq">FAQ</a>
                            </span>
                            
                            <span>
                            |
                            <a href="http://blog.grepcode.com/" rel="nofollow"><img title="Our Blog" alt="Blog" src="/static/app/images/site/blog.png" width="16" height="16" border="0"/></a>
                            <a href="http://twitter.com/grepcode/" rel="nofollow"><img title="Follow us on Twitter" alt="Twitter" src="/static/app/images/site/twitter.png" width="16" height="16" border="0"/></a>
                            <a href="http://www.facebook.com/pages/GrepCode/159698964349" rel="nofollow"><img title="Follow us on FaceBook" alt="FaceBook" src="/static/app/images/site/facebook.png" width="16" height="16" border="0"/></a>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
            <script type="text/javascript">
                    var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
                    document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
            </script>
            <script type="text/javascript">
                var pageTracker = _gat._getTracker("UA-7614624-1");
            </script>
        
        
            <script>
                function isGCEnterpriseEdition() {
                    return false;
                }
            </script>
        
        
    <div class="staging-page">
        
<div>
    <script>
    var projectTree = function() {
        var tree, currentIconMode, fileParts;

        function changeIconMode() {
            var newVal = parseInt(this.value);
            if (newVal != currentIconMode) {
                currentIconMode = newVal;
            }
            buildTree();
        }

        function loadNodeData(node, fnLoadComplete)  {
            var entityidParam = encodeURI(node.data.cb_entityid);
            var pathParam = encodeURI(node.data.cb_path);

            var sUrl = "/service/listsourcefiles?" + getEntityType() + "=" + entityidParam + "&path=" + pathParam;

            var callback = {

                success: function(oResponse) {
                    YAHOO.log("XHR transaction was successful.", "info", "example");
                    var oResults = eval("(" + oResponse.responseText + ")");
                    if (YAHOO.lang.isArray(oResults)) {
                        var level = node.data.cb_level + 1;
                        for(var i = 0; i < oResults.length; ++i) {
                            var oRes = oResults[i];
                            if (oRes.t == "d") {
                                var expand = oResults.length == 1;
                                if (isFileStagingPage() && level < fileParts.length) {
                                    if (fileParts[level] == oRes.n) {
                                        expand = true;
                                    }
                                }
                                var tempNode = new YAHOO.widget.TextNode(oRes.n, node, expand);
                                tempNode.data.cb_entityid = node.data.cb_entityid;
                                tempNode.data.cb_path = node.data.cb_path + oRes.n + "/";
                                tempNode.data.cb_level = level;
                            } else if (oRes.t == "f") {
                                if (isFileStagingPage() && level < fileParts.length && fileParts[level] == oRes.n) {
                                    var tempNode = new YAHOO.widget.TextNode(oRes.n, node, false);
                                    tempNode.isLeaf = true;
                                    tempNode.data.cb_level = level;
                                    tempNode.contentStyle = 'current-filename';
                                    // VRB - TODO - Capture div.x and div.y -- scroll div so it is in the center
                                } else {
                                    var tempNode = new YAHOO.widget.TextNode(oRes.n, node, false);
                                    tempNode.href = oRes.l+"?av=f";
                                    tempNode.isLeaf = true;
                                    tempNode.data.cb_level = level;
                                }
                            }
                        }
                    }
                    oResponse.argument.fnLoadComplete();
                },
                failure: function(oResponse) {
                    YAHOO.log("Failed to process XHR transaction.", "info", "example");
                    oResponse.argument.fnLoadComplete();
                },

                argument: {
                    "node": node,
                    "fnLoadComplete": fnLoadComplete
                },

                timeout: 7000
            };

            YAHOO.util.Connect.asyncRequest('GET', sUrl, callback);
        }

        function buildTree() {
            tree = new YAHOO.widget.TreeView("treeDiv");

            tree.setDynamicLoad(loadNodeData, currentIconMode);

            var root = tree.getRoot();

            var entityid = document.getElementById('treerootid_hidden').innerHTML;
            var tempNode = new YAHOO.widget.TextNode(createShortEntityIdLabel(entityid), root, true);
            tempNode.data.cb_entityid=entityid;
            tempNode.data.cb_path="/";
            tempNode.data.cb_level = -1;

            if (isFileStagingPage()) {
                var filePathStart = document.getElementById("entityid_hidden").innerHTML.lastIndexOf('@');
                var filePath = document.getElementById("entityid_hidden").innerHTML.substring(filePathStart + 1);
                fileParts = filePath.split('$');
            }

            tree.draw();
        }


        return {
            init: function() {
                YAHOO.util.Event.on(["mode0", "mode1"], "click", changeIconMode);
                var el = document.getElementById("mode1");
                if (el && el.checked) {
                    currentIconMode = parseInt(el.value);
                } else {
                    currentIconMode = 0;
                }

                buildTree();
            }
        }
    } ();            
    </script>
    <div id="treerootid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1</div>
    <div id="entityid_hidden" style="display:none">repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core$Configurator.java</div>
    <div id="entitytype_hidden" style="display:none">file</div>

    
    
<div class="file-staging-page">
    <div class="entity-header">
        <div class="entity-nav">
            <ul>
                <li><a href="http://repository.grepcode.com/java/ext/" rel="nofollow" class="external-link">GrepCode</a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><a href="../../../../../../../../../../../project/repository.grepcode.com/java/ext/com.google.android/android/"><span title="com.google.android / android">com.google.android / android</span></a></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span>
    <span>
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/core/Configurator.java/"><span><img class='img_base img_jdt_elcl16_backward_nav' src='/static/app/images/1x1.gif' border='0' title='4.4.3_r1' width='16' height='16'></img></span></a>
    </span>
    <a title="Version" href="../../../../../../../../../../../snapshot/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/"><span id="current-snapshot">4.4.4_r1</span></a>
    
        <a href="#" class="snapshots-more"
           onclick="this.blur();showSiblings(this);return false;"><img class='img_base img_jdt_elcl16_next_nav' src='/static/app/images/1x1.gif' border='0' title='4.3_r1&nbsp;-&nbsp;5.0.0_r1' width='16' height='16'></img></a>
    
    <div class="snapshots-panel" style="visibility: hidden; z-index:2">
        <div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.0.0_r1/com/android/uiautomator/core/Configurator.java/"><span>5.0.0_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/core/Configurator.java/"><span>5.L_preview</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java/"><span class="this-snapshot">4.4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.3_r1/com/android/uiautomator/core/Configurator.java/"><span>4.4.3_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.2_r1/com/android/uiautomator/core/Configurator.java/"><span>4.4.2_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4.1_r1/com/android/uiautomator/core/Configurator.java/"><span>4.4.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.4_r1/com/android/uiautomator/core/Configurator.java/"><span>4.4_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3.1_r1/com/android/uiautomator/core/Configurator.java/"><span>4.3.1_r1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r2.1/com/android/uiautomator/core/Configurator.java/"><span>4.3_r2.1</span></a>
        </div><div>
            <a href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/4.3_r1/com/android/uiautomator/core/Configurator.java/"><span>4.3_r1</span></a>
        </div>
    </div>
    <span>
        <a class="nav" href="../../../../../../../../../../../file/repository.grepcode.com/java/ext/com.google.android/android/5.L_preview/com/android/uiautomator/core/Configurator.java/"><span><img class='img_base img_jdt_elcl16_forward_nav' src='/static/app/images/1x1.gif' border='0' title='5.L_preview' width='16' height='16'></img></span></a>
    </span>
</span></li>
                <li><span class="entity-nav-delim">/</span></li>
                <li><span class="entity-name" title="com.android.uiautomator.core.Configurator">com.android.uiautomator.core.Configurator</span></li>
            </ul>
            <div class="entity-header-links">
                
            <!-- Google +1 -->
            <div class="g-plusone" data-size="small" data-annotation="none"></div>
        
                <span><img class='img_base img_jdt_elcl16_search' src='/static/app/images/1x1.gif' border='0' title='Find usages' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../search/usages?id=repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator&amp;type=type&amp;k=u" rel="nofollow" title="Find usages of com.android.uiautomator.core.Configurator">Find Usages</a>
                <span><img class='img_base img_jdt_eview16_compare_view' src='/static/app/images/1x1.gif' border='0' title='Diff' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java/?v=diff&amp;id2=4.4.3_r1" rel="nofollow" title="Compare with version 4.4.3_r1">Diff</a>
                <span><img class='img_base img_jdt_obj16_source_editor' src='/static/app/images/1x1.gif' border='0' title='View as plain text' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java/?v=source" rel="nofollow" title="View as plain text">Raw</a>
                <span><img class='img_base img_jdt_elcl16_save' src='/static/app/images/1x1.gif' border='0' title='Download file' width='16' height='16'></img></span>
                <a href="../../../../../../../../../../../file_/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java/?v=source&amp;disposition=attachment" rel="nofollow" title="Download file">Download</a>
                <span><img class='img_base img_jdt_obj16_html_tag_obj' src='/static/app/images/1x1.gif' border='0' title='Generate HTML snippet' width='16' height='16'></img></span>
                
                    <a id="snippet-link" onclick="showSnippetDialog(1); this.blur(); return false;" href="#" title="Generate HTML widget for a fragment from this file">HTML Widget</a>
                
                
                
                
                
            </div>
        </div>
    </div>

    <div id="allviews_hidden" style="display:none">oh</div>
    <div id="activeview_hidden" style="display:none">f</div>
    <div id="bugs" style="display:none">[]</div>

    <div id="page-mask"></div>
    <div id="snippet-dropdown" class="snippet-dropdown">
        <div id="snippet-close" onclick="hideSnippetDialog();"><img class='img_base img_jdt_elcl16_delete' src='/static/app/images/1x1.gif' border='0' title='Close window' width='16' height='16'></img></div>
        <form id="snippet-form" action="#">
            <div class="snippet-line-input">
                Start line: <input name="snippet_start" type="text" maxlength="8" size="5" value="1" />&nbsp;
                <div class="snippet-spinner-button" onclick="decFromLine();"><img class='img_base img_jdt_obj16_remove_correction' src='/static/app/images/1x1.gif' border='0' title='Previous line' width='16' height='16'></img></div>
                <div class="snippet-spinner-button" onclick="incFromLine();"><img class='img_base img_jdt_elcl16_add' src='/static/app/images/1x1.gif' border='0' title='Next line' width='16' height='16'></img></div>
            </div>
            <div class="snippet-line-input">
                End line: <input name="snippet_end" type="text" maxlength="8" size="5" value="1" />&nbsp;
                <div class="snippet-spinner-button" onclick="decToLine();"><img class='img_base img_jdt_obj16_remove_correction' src='/static/app/images/1x1.gif' border='0' title='Previous line' width='16' height='16'></img></div>
                <div class="snippet-spinner-button" onclick="incToLine();"><img class='img_base img_jdt_elcl16_add' src='/static/app/images/1x1.gif' border='0' title='Next line' width='16' height='16'></img></div>
            </div>
            <div class="snippet-get-button">
                <input type="button" name="snippet_get" value="Create HTML" onclick="fetchSnippet();" />
            </div>
            <br/>
            <p>Snippet Preview</p>
            <div id="snippet-preview"></div>
            <p>Snippet HTML Code</p>
            <textarea name="snippet_html" rows="5" cols="60" readonly="true"></textarea>
        </form>
    </div>
    
    <div id="so-question-panel" class="so-question-panel">
        <div class="so-question-header">
            Stack Overflow Questions
            
        </div>
        
    </div>
    
    <div class="entity-container">
        <div class="file-entity-panel">
            <div id="file-nav-panel" class="file-nav-panel">
                <div class="file-nav-tabs-container">
                    <div id="file-nav-tabs" class="file-nav-tabs yui-skin-sam"></div>
                </div>
            </div>
            <div id="source-view" class="source-view">
                
                
                    <script type="text/javascript">
                    if (isBrowserMSIE()) {
                        document.write("<div style=\"padding: 20px;\">" + get468x60Ad() + "</div>");
                    }
                    </script>
                
                <div>
<div class="code-panel">
<div class="jsrc">
<div class="line" id="line-1"><div class="lnml" id="lnml-1"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><pre><a name="1" href="#1">1</a></pre></div><div class="lnmr" id="lnmr-1" onmouseover="triggerLineHotspot(1);" onmouseout="untriggerLineHotspot(1);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(1); return false;"><img id="lnhs-1" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">/*</span></pre></div><div class="line" id="line-2"><div class="lnml" id="lnml-2"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><pre><a name="2" href="#2">2</a></pre></div><div class="lnmr" id="lnmr-2" onmouseover="triggerLineHotspot(2);" onmouseout="untriggerLineHotspot(2);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(2); return false;"><img id="lnhs-2" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;Copyright&nbsp;(C)&nbsp;2013&nbsp;The&nbsp;Android&nbsp;Open&nbsp;Source&nbsp;Project</span></pre></div><div class="line" id="line-3"><div class="lnml" id="lnml-3"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><pre><a name="3" href="#3">3</a></pre></div><div class="lnmr" id="lnmr-3" onmouseover="triggerLineHotspot(3);" onmouseout="untriggerLineHotspot(3);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(3); return false;"><img id="lnhs-3" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-4"><div class="lnml" id="lnml-4"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><pre><a name="4" href="#4">4</a></pre></div><div class="lnmr" id="lnmr-4" onmouseover="triggerLineHotspot(4);" onmouseout="untriggerLineHotspot(4);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(4); return false;"><img id="lnhs-4" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;Licensed&nbsp;under&nbsp;the&nbsp;Apache&nbsp;License,&nbsp;Version&nbsp;2.0&nbsp;(the&nbsp;"License");</span></pre></div><div class="line" id="line-5"><div class="lnml" id="lnml-5"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><pre><a name="5" href="#5">5</a></pre></div><div class="lnmr" id="lnmr-5" onmouseover="triggerLineHotspot(5);" onmouseout="untriggerLineHotspot(5);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(5); return false;"><img id="lnhs-5" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;you&nbsp;may&nbsp;not&nbsp;use&nbsp;this&nbsp;file&nbsp;except&nbsp;in&nbsp;compliance&nbsp;with&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-6"><div class="lnml" id="lnml-6"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><pre><a name="6" href="#6">6</a></pre></div><div class="lnmr" id="lnmr-6" onmouseover="triggerLineHotspot(6);" onmouseout="untriggerLineHotspot(6);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(6); return false;"><img id="lnhs-6" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;You&nbsp;may&nbsp;obtain&nbsp;a&nbsp;copy&nbsp;of&nbsp;the&nbsp;License&nbsp;at</span></pre></div><div class="line" id="line-7"><div class="lnml" id="lnml-7"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><pre><a name="7" href="#7">7</a></pre></div><div class="lnmr" id="lnmr-7" onmouseover="triggerLineHotspot(7);" onmouseout="untriggerLineHotspot(7);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(7); return false;"><img id="lnhs-7" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-8"><div class="lnml" id="lnml-8"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><pre><a name="8" href="#8">8</a></pre></div><div class="lnmr" id="lnmr-8" onmouseover="triggerLineHotspot(8);" onmouseout="untriggerLineHotspot(8);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(8); return false;"><img id="lnhs-8" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0</span></pre></div><div class="line" id="line-9"><div class="lnml" id="lnml-9"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><pre><a name="9" href="#9">9</a></pre></div><div class="lnmr" id="lnmr-9" onmouseover="triggerLineHotspot(9);" onmouseout="untriggerLineHotspot(9);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(9); return false;"><img id="lnhs-9" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;<span class="comment">&nbsp;*</span></pre></div><div class="line" id="line-10"><div class="lnml" id="lnml-10"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><pre><a name="10" href="#10">10</a></pre></div><div class="lnmr" id="lnmr-10" onmouseover="triggerLineHotspot(10);" onmouseout="untriggerLineHotspot(10);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(10); return false;"><img id="lnhs-10" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;Unless&nbsp;required&nbsp;by&nbsp;applicable&nbsp;law&nbsp;or&nbsp;agreed&nbsp;to&nbsp;in&nbsp;writing,&nbsp;software</span></pre></div><div class="line" id="line-11"><div class="lnml" id="lnml-11"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><pre><a name="11" href="#11">11</a></pre></div><div class="lnmr" id="lnmr-11" onmouseover="triggerLineHotspot(11);" onmouseout="untriggerLineHotspot(11);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(11); return false;"><img id="lnhs-11" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;distributed&nbsp;under&nbsp;the&nbsp;License&nbsp;is&nbsp;distributed&nbsp;on&nbsp;an&nbsp;"AS&nbsp;IS"&nbsp;BASIS,</span></pre></div><div class="line" id="line-12"><div class="lnml" id="lnml-12"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><pre><a name="12" href="#12">12</a></pre></div><div class="lnmr" id="lnmr-12" onmouseover="triggerLineHotspot(12);" onmouseout="untriggerLineHotspot(12);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(12); return false;"><img id="lnhs-12" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;WITHOUT&nbsp;WARRANTIES&nbsp;OR&nbsp;CONDITIONS&nbsp;OF&nbsp;ANY&nbsp;KIND,&nbsp;either&nbsp;express&nbsp;or&nbsp;implied.</span></pre></div><div class="line" id="line-13"><div class="lnml" id="lnml-13"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><pre><a name="13" href="#13">13</a></pre></div><div class="lnmr" id="lnmr-13" onmouseover="triggerLineHotspot(13);" onmouseout="untriggerLineHotspot(13);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(13); return false;"><img id="lnhs-13" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;See&nbsp;the&nbsp;License&nbsp;for&nbsp;the&nbsp;specific&nbsp;language&nbsp;governing&nbsp;permissions&nbsp;and</span></pre></div><div class="line" id="line-14"><div class="lnml" id="lnml-14"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><pre><a name="14" href="#14">14</a></pre></div><div class="lnmr" id="lnmr-14" onmouseover="triggerLineHotspot(14);" onmouseout="untriggerLineHotspot(14);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(14); return false;"><img id="lnhs-14" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*&nbsp;limitations&nbsp;under&nbsp;the&nbsp;License.</span></pre></div><div class="line" id="line-15"><div class="lnml" id="lnml-15"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><pre><a name="15" href="#15">15</a></pre></div><div class="lnmr" id="lnmr-15" onmouseover="triggerLineHotspot(15);" onmouseout="untriggerLineHotspot(15);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(15); return false;"><img id="lnhs-15" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="comment">&nbsp;*/</span></pre></div><div class="line" id="line-16"><div class="lnml" id="lnml-16"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><pre><a name="16" href="#16">16</a></pre></div><div class="lnmr" id="lnmr-16" onmouseover="triggerLineHotspot(16);" onmouseout="untriggerLineHotspot(16);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(16); return false;"><img id="lnhs-16" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">package</span>&nbsp;com.android.uiautomator.core;<br/><a name="16"></a><br/><a name="17"></a></pre></div><div class="javadoc-area"><div class="javadoc"><a name="18"></a><a name="19"></a><a name="20"></a><a name="21"></a><a name="22"></a><a name="23"></a><a name="24"></a><a name="25"></a><a name="26"></a><a name="27"></a> Allows you to set key parameters for running uiautomator tests. The new
 settings take effect immediately and can be changed any time during a test run.

 To modify parameters using Configurator, first obtain an instance by calling
 <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getInstance%28%29' title='com.android.uiautomator.core.Configurator.getInstance()'>getInstance()</a></code></code>. As a best practice, make sure you always save
 the original value of any parameter that you are modifying. After running your
 tests with the modified parameters, make sure to also restore
 the original parameter values, otherwise this will impact other tests cases.
 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-28"><div class="lnml" id="lnml-28"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(28);" onmouseout="untriggerLineHotspot(28);"><pre><a name="28" href="#28">28</a></pre></div><div class="lnmr" id="lnmr-28" onmouseover="triggerLineHotspot(28);" onmouseout="untriggerLineHotspot(28);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(28); return false;"><img id="lnhs-28" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-29"><div class="lnml" id="lnml-29"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(29);" onmouseout="untriggerLineHotspot(29);"><pre><a name="29" href="#29">29</a></pre></div><div class="lnmr" id="lnmr-29" onmouseover="triggerLineHotspot(29);" onmouseout="untriggerLineHotspot(29);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(29); return false;"><img id="lnhs-29" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">final</span>&nbsp;<span class="kw">class</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'type','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator',true,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator">Configurator</a>&nbsp;{</pre></div><div class="line" id="line-30"><div class="lnml" id="lnml-30"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><pre><a name="30" href="#30">30</a></pre></div><div class="lnmr" id="lnmr-30" onmouseover="triggerLineHotspot(30);" onmouseout="untriggerLineHotspot(30);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(30); return false;"><img id="lnhs-30" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0mWaitForIdleTimeout">mWaitForIdleTimeout</a></span>&nbsp;=&nbsp;10&nbsp;*&nbsp;1000;</pre></div><div class="line" id="line-31"><div class="lnml" id="lnml-31"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><pre><a name="31" href="#31">31</a></pre></div><div class="lnmr" id="lnmr-31" onmouseover="triggerLineHotspot(31);" onmouseout="untriggerLineHotspot(31);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(31); return false;"><img id="lnhs-31" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0mWaitForSelector">mWaitForSelector</a></span>&nbsp;=&nbsp;10&nbsp;*&nbsp;1000;</pre></div><div class="line" id="line-32"><div class="lnml" id="lnml-32"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><pre><a name="32" href="#32">32</a></pre></div><div class="lnmr" id="lnmr-32" onmouseover="triggerLineHotspot(32);" onmouseout="untriggerLineHotspot(32);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(32); return false;"><img id="lnhs-32" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0mWaitForActionAcknowledgment">mWaitForActionAcknowledgment</a></span>&nbsp;=&nbsp;3&nbsp;*&nbsp;1000;</pre></div><div class="line" id="line-33"><div class="lnml" id="lnml-33"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><pre><a name="33" href="#33">33</a></pre></div><div class="lnmr" id="lnmr-33" onmouseover="triggerLineHotspot(33);" onmouseout="untriggerLineHotspot(33);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(33); return false;"><img id="lnhs-33" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-34"><div class="lnml" id="lnml-34"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><pre><a name="34" href="#34">34</a></pre></div><div class="lnmr" id="lnmr-34" onmouseover="triggerLineHotspot(34);" onmouseout="untriggerLineHotspot(34);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(34); return false;"><img id="lnhs-34" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;The&nbsp;events&nbsp;for&nbsp;a&nbsp;scroll&nbsp;typically&nbsp;complete&nbsp;even&nbsp;before&nbsp;touchUp&nbsp;occurs.</span></pre></div></span><div class="line" id="line-35"><div class="lnml" id="lnml-35"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><pre><a name="35" href="#35">35</a></pre></div><div class="lnmr" id="lnmr-35" onmouseover="triggerLineHotspot(35);" onmouseout="untriggerLineHotspot(35);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(35); return false;"><img id="lnhs-35" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;This&nbsp;short&nbsp;timeout&nbsp;to&nbsp;make&nbsp;sure&nbsp;we&nbsp;get&nbsp;the&nbsp;very&nbsp;last&nbsp;in&nbsp;cases&nbsp;where&nbsp;the&nbsp;above&nbsp;isn't&nbsp;true.</span></pre></div></span><div class="line" id="line-36"><div class="lnml" id="lnml-36"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><pre><a name="36" href="#36">36</a></pre></div><div class="lnmr" id="lnmr-36" onmouseover="triggerLineHotspot(36);" onmouseout="untriggerLineHotspot(36);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(36); return false;"><img id="lnhs-36" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0mScrollEventWaitTimeout">mScrollEventWaitTimeout</a></span>&nbsp;=&nbsp;200;&nbsp;<span class="comment">//&nbsp;ms</span></pre></div></span><div class="line" id="line-37"><div class="lnml" id="lnml-37"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><pre><a name="37" href="#37">37</a></pre></div><div class="lnmr" id="lnmr-37" onmouseover="triggerLineHotspot(37);" onmouseout="untriggerLineHotspot(37);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(37); return false;"><img id="lnhs-37" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-38"><div class="lnml" id="lnml-38"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><pre><a name="38" href="#38">38</a></pre></div><div class="lnmr" id="lnmr-38" onmouseover="triggerLineHotspot(38);" onmouseout="untriggerLineHotspot(38);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(38); return false;"><img id="lnhs-38" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;Default&nbsp;is&nbsp;inject&nbsp;as&nbsp;fast&nbsp;as&nbsp;we&nbsp;can</span></pre></div></span><div class="line" id="line-39"><div class="lnml" id="lnml-39"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><pre><a name="39" href="#39">39</a></pre></div><div class="lnmr" id="lnmr-39" onmouseover="triggerLineHotspot(39);" onmouseout="untriggerLineHotspot(39);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(39); return false;"><img id="lnhs-39" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">long</span>&nbsp;<span class="mark-4#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0mKeyInjectionDelay">mKeyInjectionDelay</a></span>&nbsp;=&nbsp;0;&nbsp;<span class="comment">//&nbsp;ms</span></pre></div></span><div class="line" id="line-40"><div class="lnml" id="lnml-40"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><pre><a name="40" href="#40">40</a></pre></div><div class="lnmr" id="lnmr-40" onmouseover="triggerLineHotspot(40);" onmouseout="untriggerLineHotspot(40);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(40); return false;"><img id="lnhs-40" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-41"><div class="lnml" id="lnml-41"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><pre><a name="41" href="#41">41</a></pre></div><div class="lnmr" id="lnmr-41" onmouseover="triggerLineHotspot(41);" onmouseout="untriggerLineHotspot(41);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(41); return false;"><img id="lnhs-41" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;reference&nbsp;to&nbsp;self</span></pre></div></span><div class="line" id="line-42"><div class="lnml" id="lnml-42"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(42);" onmouseout="untriggerLineHotspot(42);"><pre><a name="42" href="#42">42</a></pre></div><div class="lnmr" id="lnmr-42" onmouseover="triggerLineHotspot(42);" onmouseout="untriggerLineHotspot(42);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(42); return false;"><img id="lnhs-42" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<span class="kw">static</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a name="Configurator.0sConfigurator">sConfigurator</a></span>;</pre></div><div class="line" id="line-43"><div class="lnml" id="lnml-43"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(43);" onmouseout="untriggerLineHotspot(43);"><pre><a name="43" href="#43">43</a></pre></div><div class="lnmr" id="lnmr-43" onmouseover="triggerLineHotspot(43);" onmouseout="untriggerLineHotspot(43);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(43); return false;"><img id="lnhs-43" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-44"><div class="lnml" id="lnml-44"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(44);" onmouseout="untriggerLineHotspot(44);"><pre><a name="44" href="#44">44</a></pre></div><div class="lnmr" id="lnmr-44" onmouseover="triggerLineHotspot(44);" onmouseout="untriggerLineHotspot(44);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(44); return false;"><img id="lnhs-44" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">private</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@<init>()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.%3Cinit%3E%28%29">Configurator</a>()&nbsp;{</pre></div><div class="line" id="line-45"><div class="lnml" id="lnml-45"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(45);" onmouseout="untriggerLineHotspot(45);"><pre><a name="45" href="#45">45</a></pre></div><div class="lnmr" id="lnmr-45" onmouseover="triggerLineHotspot(45);" onmouseout="untriggerLineHotspot(45);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(45); return false;"><img id="lnhs-45" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">/*&nbsp;hide&nbsp;constructor&nbsp;*/</span></pre></div><div class="line" id="line-46"><div class="lnml" id="lnml-46"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(46);" onmouseout="untriggerLineHotspot(46);"><pre><a name="46" href="#46">46</a></pre></div><div class="lnmr" id="lnmr-46" onmouseover="triggerLineHotspot(46);" onmouseout="untriggerLineHotspot(46);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(46); return false;"><img id="lnhs-46" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="46"></a><br/><a name="47"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="48"></a><a name="49"></a><a name="50"></a><a name="51"></a><a name="52"></a> Retrieves a singleton instance of Configurator.

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>Configurator instance</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-53"><div class="lnml" id="lnml-53"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><pre><a name="53" href="#53">53</a></pre></div><div class="lnmr" id="lnmr-53" onmouseover="triggerLineHotspot(53);" onmouseout="untriggerLineHotspot(53);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(53); return false;"><img id="lnhs-53" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-54"><div class="lnml" id="lnml-54"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><pre><a name="54" href="#54">54</a></pre></div><div class="lnmr" id="lnmr-54" onmouseover="triggerLineHotspot(54);" onmouseout="untriggerLineHotspot(54);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(54); return false;"><img id="lnhs-54" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">static</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getInstance()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getInstance%28%29">getInstance</a>()&nbsp;{</pre></div><div class="line" id="line-55"><div class="lnml" id="lnml-55"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><pre><a name="55" href="#55">55</a></pre></div><div class="lnmr" id="lnmr-55" onmouseover="triggerLineHotspot(55);" onmouseout="untriggerLineHotspot(55);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(55); return false;"><img id="lnhs-55" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">if</span>&nbsp;(<span class="mark-5#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0sConfigurator" title="Configurator sConfigurator" class="hidden">sConfigurator</a></span>&nbsp;==&nbsp;<span class="kw">null</span>)&nbsp;{</pre></div><div class="line" id="line-56"><div class="lnml" id="lnml-56"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(56);" onmouseout="untriggerLineHotspot(56);"><pre><a name="56" href="#56">56</a></pre></div><div class="lnmr" id="lnmr-56" onmouseover="triggerLineHotspot(56);" onmouseout="untriggerLineHotspot(56);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(56); return false;"><img id="lnhs-56" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-5#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0sConfigurator" title="Configurator sConfigurator" class="hidden">sConfigurator</a></span>&nbsp;=&nbsp;<span class="kw">new</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>();</pre></div><div class="line" id="line-57"><div class="lnml" id="lnml-57"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(57);" onmouseout="untriggerLineHotspot(57);"><pre><a name="57" href="#57">57</a></pre></div><div class="lnmr" id="lnmr-57" onmouseover="triggerLineHotspot(57);" onmouseout="untriggerLineHotspot(57);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(57); return false;"><img id="lnhs-57" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-58"><div class="lnml" id="lnml-58"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(58);" onmouseout="untriggerLineHotspot(58);"><pre><a name="58" href="#58">58</a></pre></div><div class="lnmr" id="lnmr-58" onmouseover="triggerLineHotspot(58);" onmouseout="untriggerLineHotspot(58);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(58); return false;"><img id="lnhs-58" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-5#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0sConfigurator" title="Configurator sConfigurator" class="hidden">sConfigurator</a></span>;</pre></div><div class="line" id="line-59"><div class="lnml" id="lnml-59"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><pre><a name="59" href="#59">59</a></pre></div><div class="lnmr" id="lnmr-59" onmouseover="triggerLineHotspot(59);" onmouseout="untriggerLineHotspot(59);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(59); return false;"><img id="lnhs-59" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="59"></a><br/><a name="60"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="61"></a><a name="62"></a><a name="63"></a><a name="64"></a><a name="65"></a><a name="66"></a><a name="67"></a><a name="68"></a><a name="69"></a><a name="70"></a><a name="71"></a><a name="72"></a><a name="73"></a><a name="74"></a> Sets the timeout for waiting for the user interface to go into an idle
 state before starting a uiautomator action.

 By default, all core uiautomator objects except <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiDevice.java#UiDevice' title='com.android.uiautomator.core.UiDevice'>UiDevice</a></code></code> will perform
 this wait before starting to search for the widget specified by the
 object&apos;s <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiSelector.java#UiSelector' title='com.android.uiautomator.core.UiSelector'>UiSelector</a></code></code>. Once the idle state is detected or the
 timeout elapses (whichever occurs first), the object will start to wait
 for the selector to find a match.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setWaitForSelectorTimeout%28long%29' title='com.android.uiautomator.core.Configurator.setWaitForSelectorTimeout(long)'>setWaitForSelectorTimeout(long)</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>timeout</code> Timeout value in milliseconds</dd><dt><span class="javadoc-key"> Returns:</span></dt><dd>self</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-75"><div class="lnml" id="lnml-75"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><pre><a name="75" href="#75">75</a></pre></div><div class="lnmr" id="lnmr-75" onmouseover="triggerLineHotspot(75);" onmouseout="untriggerLineHotspot(75);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(75); return false;"><img id="lnhs-75" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-76"><div class="lnml" id="lnml-76"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><pre><a name="76" href="#76">76</a></pre></div><div class="lnmr" id="lnmr-76" onmouseover="triggerLineHotspot(76);" onmouseout="untriggerLineHotspot(76);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(76); return false;"><img id="lnhs-76" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForIdleTimeout(long)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.setWaitForIdleTimeout%28long%29">setWaitForIdleTimeout</a>(<span class="kw">long</span>&nbsp;<span class="mark-6#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>)&nbsp;{</pre></div><div class="line" id="line-77"><div class="lnml" id="lnml-77"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><pre><a name="77" href="#77">77</a></pre></div><div class="lnmr" id="lnmr-77" onmouseover="triggerLineHotspot(77);" onmouseout="untriggerLineHotspot(77);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(77); return false;"><img id="lnhs-77" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-0#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForIdleTimeout" title="long mWaitForIdleTimeout" class="hidden">mWaitForIdleTimeout</a></span>&nbsp;=&nbsp;<span class="mark-6#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>;</pre></div><div class="line" id="line-78"><div class="lnml" id="lnml-78"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><pre><a name="78" href="#78">78</a></pre></div><div class="lnmr" id="lnmr-78" onmouseover="triggerLineHotspot(78);" onmouseout="untriggerLineHotspot(78);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(78); return false;"><img id="lnhs-78" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">this</span>;</pre></div><div class="line" id="line-79"><div class="lnml" id="lnml-79"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><pre><a name="79" href="#79">79</a></pre></div><div class="lnmr" id="lnmr-79" onmouseover="triggerLineHotspot(79);" onmouseout="untriggerLineHotspot(79);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(79); return false;"><img id="lnhs-79" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="79"></a><br/><a name="80"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="81"></a><a name="82"></a><a name="83"></a><a name="84"></a><a name="85"></a><a name="86"></a><a name="87"></a><a name="88"></a><a name="89"></a><a name="90"></a><a name="91"></a><a name="92"></a><a name="93"></a> Gets the current timeout used for waiting for the user interface to go
 into an idle state.

 By default, all core uiautomator objects except <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiDevice.java#UiDevice' title='com.android.uiautomator.core.UiDevice'>UiDevice</a></code></code> will perform
 this wait before starting to search for the widget specified by the
 object&apos;s <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiSelector.java#UiSelector' title='com.android.uiautomator.core.UiSelector'>UiSelector</a></code></code>. Once the idle state is detected or the
 timeout elapses (whichever occurs first), the object will start to wait
 for the selector to find a match.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setWaitForSelectorTimeout%28long%29' title='com.android.uiautomator.core.Configurator.setWaitForSelectorTimeout(long)'>setWaitForSelectorTimeout(long)</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>Current timeout value in milliseconds</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-94"><div class="lnml" id="lnml-94"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><pre><a name="94" href="#94">94</a></pre></div><div class="lnmr" id="lnmr-94" onmouseover="triggerLineHotspot(94);" onmouseout="untriggerLineHotspot(94);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(94); return false;"><img id="lnhs-94" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;</pre></div><div class="line" id="line-95"><div class="lnml" id="lnml-95"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><pre><a name="95" href="#95">95</a></pre></div><div class="lnmr" id="lnmr-95" onmouseover="triggerLineHotspot(95);" onmouseout="untriggerLineHotspot(95);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(95); return false;"><img id="lnhs-95" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForIdleTimeout()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getWaitForIdleTimeout%28%29">getWaitForIdleTimeout</a>()&nbsp;{</pre></div><div class="line" id="line-96"><div class="lnml" id="lnml-96"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><pre><a name="96" href="#96">96</a></pre></div><div class="lnmr" id="lnmr-96" onmouseover="triggerLineHotspot(96);" onmouseout="untriggerLineHotspot(96);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(96); return false;"><img id="lnhs-96" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-0#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForIdleTimeout" title="long mWaitForIdleTimeout" class="hidden">mWaitForIdleTimeout</a></span>;</pre></div><div class="line" id="line-97"><div class="lnml" id="lnml-97"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(97);" onmouseout="untriggerLineHotspot(97);"><pre><a name="97" href="#97">97</a></pre></div><div class="lnmr" id="lnmr-97" onmouseover="triggerLineHotspot(97);" onmouseout="untriggerLineHotspot(97);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(97); return false;"><img id="lnhs-97" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="97"></a><br/><a name="98"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="99"></a><a name="100"></a><a name="101"></a><a name="102"></a><a name="103"></a><a name="104"></a><a name="105"></a><a name="106"></a><a name="107"></a><a name="108"></a><a name="109"></a><a name="110"></a> Sets the timeout for waiting for a widget to become visible in the user
 interface so that it can be matched by a selector.

 Because user interface content is dynamic, sometimes a widget may not
 be visible immediately and won&apos;t be detected by a selector. This timeout
 allows the uiautomator framework to wait for a match to be found, up until
 the timeout elapses.

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>timeout</code> Timeout value in milliseconds.</dd><dt><span class="javadoc-key"> Returns:</span></dt><dd>self</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-111"><div class="lnml" id="lnml-111"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><pre><a name="111" href="#111">111</a></pre></div><div class="lnmr" id="lnmr-111" onmouseover="triggerLineHotspot(111);" onmouseout="untriggerLineHotspot(111);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(111); return false;"><img id="lnhs-111" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-112"><div class="lnml" id="lnml-112"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><pre><a name="112" href="#112">112</a></pre></div><div class="lnmr" id="lnmr-112" onmouseover="triggerLineHotspot(112);" onmouseout="untriggerLineHotspot(112);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(112); return false;"><img id="lnhs-112" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForSelectorTimeout(long)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.setWaitForSelectorTimeout%28long%29">setWaitForSelectorTimeout</a>(<span class="kw">long</span>&nbsp;<span class="mark-7#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>)&nbsp;{</pre></div><div class="line" id="line-113"><div class="lnml" id="lnml-113"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><pre><a name="113" href="#113">113</a></pre></div><div class="lnmr" id="lnmr-113" onmouseover="triggerLineHotspot(113);" onmouseout="untriggerLineHotspot(113);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(113); return false;"><img id="lnhs-113" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-1#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForSelector" title="long mWaitForSelector" class="hidden">mWaitForSelector</a></span>&nbsp;=&nbsp;<span class="mark-7#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>;</pre></div><div class="line" id="line-114"><div class="lnml" id="lnml-114"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><pre><a name="114" href="#114">114</a></pre></div><div class="lnmr" id="lnmr-114" onmouseover="triggerLineHotspot(114);" onmouseout="untriggerLineHotspot(114);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(114); return false;"><img id="lnhs-114" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">this</span>;</pre></div><div class="line" id="line-115"><div class="lnml" id="lnml-115"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><pre><a name="115" href="#115">115</a></pre></div><div class="lnmr" id="lnmr-115" onmouseover="triggerLineHotspot(115);" onmouseout="untriggerLineHotspot(115);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(115); return false;"><img id="lnhs-115" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="115"></a><br/><a name="116"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="117"></a><a name="118"></a><a name="119"></a><a name="120"></a><a name="121"></a><a name="122"></a><a name="123"></a><a name="124"></a><a name="125"></a><a name="126"></a><a name="127"></a> Gets the current timeout for waiting for a widget to become visible in
 the user interface so that it can be matched by a selector.

 Because user interface content is dynamic, sometimes a widget may not
 be visible immediately and won&apos;t be detected by a selector. This timeout
 allows the uiautomator framework to wait for a match to be found, up until
 the timeout elapses.

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>Current timeout value in milliseconds</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-128"><div class="lnml" id="lnml-128"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><pre><a name="128" href="#128">128</a></pre></div><div class="lnmr" id="lnmr-128" onmouseover="triggerLineHotspot(128);" onmouseout="untriggerLineHotspot(128);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(128); return false;"><img id="lnhs-128" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-129"><div class="lnml" id="lnml-129"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><pre><a name="129" href="#129">129</a></pre></div><div class="lnmr" id="lnmr-129" onmouseover="triggerLineHotspot(129);" onmouseout="untriggerLineHotspot(129);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(129); return false;"><img id="lnhs-129" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForSelectorTimeout()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getWaitForSelectorTimeout%28%29">getWaitForSelectorTimeout</a>()&nbsp;{</pre></div><div class="line" id="line-130"><div class="lnml" id="lnml-130"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><pre><a name="130" href="#130">130</a></pre></div><div class="lnmr" id="lnmr-130" onmouseover="triggerLineHotspot(130);" onmouseout="untriggerLineHotspot(130);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(130); return false;"><img id="lnhs-130" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-1#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForSelector" title="long mWaitForSelector" class="hidden">mWaitForSelector</a></span>;</pre></div><div class="line" id="line-131"><div class="lnml" id="lnml-131"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><pre><a name="131" href="#131">131</a></pre></div><div class="lnmr" id="lnmr-131" onmouseover="triggerLineHotspot(131);" onmouseout="untriggerLineHotspot(131);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(131); return false;"><img id="lnhs-131" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="131"></a><br/><a name="132"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="133"></a><a name="134"></a><a name="135"></a><a name="136"></a><a name="137"></a><a name="138"></a><a name="139"></a><a name="140"></a><a name="141"></a><a name="142"></a><a name="143"></a><a name="144"></a> Sets the timeout for waiting for an acknowledgement of an
 uiautomtor scroll swipe action.

 The acknowledgment is an <span class="was-link">AccessibilityEvent</span>,
 corresponding to the scroll action, that lets the framework determine if
 the scroll action was successful. Generally, this timeout should not be modified.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiScrollable.java#UiScrollable' title='com.android.uiautomator.core.UiScrollable'>UiScrollable</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>timeout</code> Timeout value in milliseconds</dd><dt><span class="javadoc-key"> Returns:</span></dt><dd>self</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-145"><div class="lnml" id="lnml-145"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(145);" onmouseout="untriggerLineHotspot(145);"><pre><a name="145" href="#145">145</a></pre></div><div class="lnmr" id="lnmr-145" onmouseover="triggerLineHotspot(145);" onmouseout="untriggerLineHotspot(145);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(145); return false;"><img id="lnhs-145" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-146"><div class="lnml" id="lnml-146"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(146);" onmouseout="untriggerLineHotspot(146);"><pre><a name="146" href="#146">146</a></pre></div><div class="lnmr" id="lnmr-146" onmouseover="triggerLineHotspot(146);" onmouseout="untriggerLineHotspot(146);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(146); return false;"><img id="lnhs-146" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setScrollAcknowledgmentTimeout(long)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.setScrollAcknowledgmentTimeout%28long%29">setScrollAcknowledgmentTimeout</a>(<span class="kw">long</span>&nbsp;<span class="mark-8#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>)&nbsp;{</pre></div><div class="line" id="line-147"><div class="lnml" id="lnml-147"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(147);" onmouseout="untriggerLineHotspot(147);"><pre><a name="147" href="#147">147</a></pre></div><div class="lnmr" id="lnmr-147" onmouseover="triggerLineHotspot(147);" onmouseout="untriggerLineHotspot(147);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(147); return false;"><img id="lnhs-147" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-3#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mScrollEventWaitTimeout" title="long mScrollEventWaitTimeout" class="hidden">mScrollEventWaitTimeout</a></span>&nbsp;=&nbsp;<span class="mark-8#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>;</pre></div><div class="line" id="line-148"><div class="lnml" id="lnml-148"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(148);" onmouseout="untriggerLineHotspot(148);"><pre><a name="148" href="#148">148</a></pre></div><div class="lnmr" id="lnmr-148" onmouseover="triggerLineHotspot(148);" onmouseout="untriggerLineHotspot(148);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(148); return false;"><img id="lnhs-148" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">this</span>;</pre></div><div class="line" id="line-149"><div class="lnml" id="lnml-149"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(149);" onmouseout="untriggerLineHotspot(149);"><pre><a name="149" href="#149">149</a></pre></div><div class="lnmr" id="lnmr-149" onmouseover="triggerLineHotspot(149);" onmouseout="untriggerLineHotspot(149);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(149); return false;"><img id="lnhs-149" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="149"></a><br/><a name="150"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="151"></a><a name="152"></a><a name="153"></a><a name="154"></a><a name="155"></a><a name="156"></a><a name="157"></a><a name="158"></a><a name="159"></a><a name="160"></a><a name="161"></a> Gets the timeout for waiting for an acknowledgement of an
 uiautomtor scroll swipe action.

 The acknowledgment is an <span class="was-link">AccessibilityEvent</span>,
 corresponding to the scroll action, that lets the framework determine if
 the scroll action was successful. Generally, this timeout should not be modified.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiScrollable.java#UiScrollable' title='com.android.uiautomator.core.UiScrollable'>UiScrollable</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>current timeout in milliseconds</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-162"><div class="lnml" id="lnml-162"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(162);" onmouseout="untriggerLineHotspot(162);"><pre><a name="162" href="#162">162</a></pre></div><div class="lnmr" id="lnmr-162" onmouseover="triggerLineHotspot(162);" onmouseout="untriggerLineHotspot(162);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(162); return false;"><img id="lnhs-162" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-163"><div class="lnml" id="lnml-163"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(163);" onmouseout="untriggerLineHotspot(163);"><pre><a name="163" href="#163">163</a></pre></div><div class="lnmr" id="lnmr-163" onmouseover="triggerLineHotspot(163);" onmouseout="untriggerLineHotspot(163);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(163); return false;"><img id="lnhs-163" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getScrollAcknowledgmentTimeout()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getScrollAcknowledgmentTimeout%28%29">getScrollAcknowledgmentTimeout</a>()&nbsp;{</pre></div><div class="line" id="line-164"><div class="lnml" id="lnml-164"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(164);" onmouseout="untriggerLineHotspot(164);"><pre><a name="164" href="#164">164</a></pre></div><div class="lnmr" id="lnmr-164" onmouseover="triggerLineHotspot(164);" onmouseout="untriggerLineHotspot(164);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(164); return false;"><img id="lnhs-164" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-3#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mScrollEventWaitTimeout" title="long mScrollEventWaitTimeout" class="hidden">mScrollEventWaitTimeout</a></span>;</pre></div><div class="line" id="line-165"><div class="lnml" id="lnml-165"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(165);" onmouseout="untriggerLineHotspot(165);"><pre><a name="165" href="#165">165</a></pre></div><div class="lnmr" id="lnmr-165" onmouseover="triggerLineHotspot(165);" onmouseout="untriggerLineHotspot(165);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(165); return false;"><img id="lnhs-165" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="165"></a><br/><a name="166"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="167"></a><a name="168"></a><a name="169"></a><a name="170"></a><a name="171"></a><a name="172"></a><a name="173"></a><a name="174"></a><a name="175"></a><a name="176"></a><a name="177"></a><a name="178"></a> Sets the timeout for waiting for an acknowledgment of generic uiautomator
 actions, such as clicks, text setting, and menu presses.

 The acknowledgment is an <span class="was-link">AccessibilityEvent</span>,
 corresponding to an action, that lets the framework determine if the
 action was successful. Generally, this timeout should not be modified.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiObject.java#UiObject' title='com.android.uiautomator.core.UiObject'>UiObject</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>timeout</code> Timeout value in milliseconds</dd><dt><span class="javadoc-key"> Returns:</span></dt><dd>self</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-179"><div class="lnml" id="lnml-179"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(179);" onmouseout="untriggerLineHotspot(179);"><pre><a name="179" href="#179">179</a></pre></div><div class="lnmr" id="lnmr-179" onmouseover="triggerLineHotspot(179);" onmouseout="untriggerLineHotspot(179);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(179); return false;"><img id="lnhs-179" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-180"><div class="lnml" id="lnml-180"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(180);" onmouseout="untriggerLineHotspot(180);"><pre><a name="180" href="#180">180</a></pre></div><div class="lnmr" id="lnmr-180" onmouseover="triggerLineHotspot(180);" onmouseout="untriggerLineHotspot(180);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(180); return false;"><img id="lnhs-180" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setActionAcknowledgmentTimeout(long)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.setActionAcknowledgmentTimeout%28long%29">setActionAcknowledgmentTimeout</a>(<span class="kw">long</span>&nbsp;<span class="mark-9#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>)&nbsp;{</pre></div><div class="line" id="line-181"><div class="lnml" id="lnml-181"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(181);" onmouseout="untriggerLineHotspot(181);"><pre><a name="181" href="#181">181</a></pre></div><div class="lnmr" id="lnmr-181" onmouseover="triggerLineHotspot(181);" onmouseout="untriggerLineHotspot(181);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(181); return false;"><img id="lnhs-181" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-2#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForActionAcknowledgment" title="long mWaitForActionAcknowledgment" class="hidden">mWaitForActionAcknowledgment</a></span>&nbsp;=&nbsp;<span class="mark-9#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">timeout</span>;</pre></div><div class="line" id="line-182"><div class="lnml" id="lnml-182"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(182);" onmouseout="untriggerLineHotspot(182);"><pre><a name="182" href="#182">182</a></pre></div><div class="lnmr" id="lnmr-182" onmouseover="triggerLineHotspot(182);" onmouseout="untriggerLineHotspot(182);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(182); return false;"><img id="lnhs-182" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">this</span>;</pre></div><div class="line" id="line-183"><div class="lnml" id="lnml-183"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(183);" onmouseout="untriggerLineHotspot(183);"><pre><a name="183" href="#183">183</a></pre></div><div class="lnmr" id="lnmr-183" onmouseover="triggerLineHotspot(183);" onmouseout="untriggerLineHotspot(183);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(183); return false;"><img id="lnhs-183" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="183"></a><br/><a name="184"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="185"></a><a name="186"></a><a name="187"></a><a name="188"></a><a name="189"></a><a name="190"></a><a name="191"></a><a name="192"></a><a name="193"></a><a name="194"></a><a name="195"></a> Gets the current timeout for waiting for an acknowledgment of generic
 uiautomator actions, such as clicks, text setting, and menu presses.

 The acknowledgment is an <span class="was-link">AccessibilityEvent</span>,
 corresponding to an action, that lets the framework determine if the
 action was successful. Generally, this timeout should not be modified.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiObject.java#UiObject' title='com.android.uiautomator.core.UiObject'>UiObject</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>current timeout in milliseconds</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-196"><div class="lnml" id="lnml-196"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(196);" onmouseout="untriggerLineHotspot(196);"><pre><a name="196" href="#196">196</a></pre></div><div class="lnmr" id="lnmr-196" onmouseover="triggerLineHotspot(196);" onmouseout="untriggerLineHotspot(196);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(196); return false;"><img id="lnhs-196" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-197"><div class="lnml" id="lnml-197"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(197);" onmouseout="untriggerLineHotspot(197);"><pre><a name="197" href="#197">197</a></pre></div><div class="lnmr" id="lnmr-197" onmouseover="triggerLineHotspot(197);" onmouseout="untriggerLineHotspot(197);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(197); return false;"><img id="lnhs-197" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getActionAcknowledgmentTimeout()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getActionAcknowledgmentTimeout%28%29">getActionAcknowledgmentTimeout</a>()&nbsp;{</pre></div><div class="line" id="line-198"><div class="lnml" id="lnml-198"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(198);" onmouseout="untriggerLineHotspot(198);"><pre><a name="198" href="#198">198</a></pre></div><div class="lnmr" id="lnmr-198" onmouseover="triggerLineHotspot(198);" onmouseout="untriggerLineHotspot(198);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(198); return false;"><img id="lnhs-198" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-2#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForActionAcknowledgment" title="long mWaitForActionAcknowledgment" class="hidden">mWaitForActionAcknowledgment</a></span>;</pre></div><div class="line" id="line-199"><div class="lnml" id="lnml-199"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(199);" onmouseout="untriggerLineHotspot(199);"><pre><a name="199" href="#199">199</a></pre></div><div class="lnmr" id="lnmr-199" onmouseover="triggerLineHotspot(199);" onmouseout="untriggerLineHotspot(199);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(199); return false;"><img id="lnhs-199" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="199"></a><br/><a name="200"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="201"></a><a name="202"></a><a name="203"></a><a name="204"></a><a name="205"></a><a name="206"></a><a name="207"></a> Sets a delay between key presses when injecting text input.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiObject.java#UiObject.setText%28java.lang.String%29' title='com.android.uiautomator.core.UiObject.setText(java.lang.String)'>UiObject.setText(java.lang.String)</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Parameters:</span></dt><dd><code>delay</code> Delay value in milliseconds</dd><dt><span class="javadoc-key"> Returns:</span></dt><dd>self</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-208"><div class="lnml" id="lnml-208"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(208);" onmouseout="untriggerLineHotspot(208);"><pre><a name="208" href="#208">208</a></pre></div><div class="lnmr" id="lnmr-208" onmouseover="triggerLineHotspot(208);" onmouseout="untriggerLineHotspot(208);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(208); return false;"><img id="lnhs-208" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-209"><div class="lnml" id="lnml-209"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(209);" onmouseout="untriggerLineHotspot(209);"><pre><a name="209" href="#209">209</a></pre></div><div class="lnmr" id="lnmr-209" onmouseover="triggerLineHotspot(209);" onmouseout="untriggerLineHotspot(209);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(209); return false;"><img id="lnhs-209" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="com.android.uiautomator.core.Configurator">Configurator</a>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setKeyInjectionDelay(long)',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.setKeyInjectionDelay%28long%29">setKeyInjectionDelay</a>(<span class="kw">long</span>&nbsp;<span class="mark-10#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">delay</span>)&nbsp;{</pre></div><div class="line" id="line-210"><div class="lnml" id="lnml-210"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(210);" onmouseout="untriggerLineHotspot(210);"><pre><a name="210" href="#210">210</a></pre></div><div class="lnmr" id="lnmr-210" onmouseover="triggerLineHotspot(210);" onmouseout="untriggerLineHotspot(210);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(210); return false;"><img id="lnhs-210" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mark-4#0" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mKeyInjectionDelay" title="long mKeyInjectionDelay" class="hidden">mKeyInjectionDelay</a></span>&nbsp;=&nbsp;<span class="mark-10#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);">delay</span>;</pre></div><div class="line" id="line-211"><div class="lnml" id="lnml-211"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(211);" onmouseout="untriggerLineHotspot(211);"><pre><a name="211" href="#211">211</a></pre></div><div class="lnmr" id="lnmr-211" onmouseover="triggerLineHotspot(211);" onmouseout="untriggerLineHotspot(211);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(211); return false;"><img id="lnhs-211" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="kw">this</span>;</pre></div><div class="line" id="line-212"><div class="lnml" id="lnml-212"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(212);" onmouseout="untriggerLineHotspot(212);"><pre><a name="212" href="#212">212</a></pre></div><div class="lnmr" id="lnmr-212" onmouseover="triggerLineHotspot(212);" onmouseout="untriggerLineHotspot(212);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(212); return false;"><img id="lnhs-212" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}<br/><a name="212"></a><br/><a name="213"></a>&nbsp;&nbsp;&nbsp;&nbsp;</pre></div><div class="javadoc-area"><div class="javadoc"><a name="214"></a><a name="215"></a><a name="216"></a><a name="217"></a><a name="218"></a><a name="219"></a> Gets the current delay between key presses when injecting text input.
 See <code><code><a href='/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/UiObject.java#UiObject.setText%28java.lang.String%29' title='com.android.uiautomator.core.UiObject.setText(java.lang.String)'>UiObject.setText(java.lang.String)</a></code></code>

 <p></p><div class="javadoc-tag-area"><dl><dt><span class="javadoc-key"> Returns:</span></dt><dd>current delay in milliseconds</dd><dt><span class="javadoc-key"> Since:</span></dt><dd>API Level 18</dd></dl></div></div></div><div class="line" id="line-220"><div class="lnml" id="lnml-220"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(220);" onmouseout="untriggerLineHotspot(220);"><pre><a name="220" href="#220">220</a></pre></div><div class="lnmr" id="lnmr-220" onmouseover="triggerLineHotspot(220);" onmouseout="untriggerLineHotspot(220);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(220); return false;"><img id="lnhs-220" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre></pre></div><div class="line" id="line-221"><div class="lnml" id="lnml-221"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(221);" onmouseout="untriggerLineHotspot(221);"><pre><a name="221" href="#221">221</a></pre></div><div class="lnmr" id="lnmr-221" onmouseover="triggerLineHotspot(221);" onmouseout="untriggerLineHotspot(221);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(221); return false;"><img id="lnhs-221" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">public</span>&nbsp;<span class="kw">long</span>&nbsp;<a class="context-menu" href="#" onclick="this.blur();entDeclCtxMenu(this, 'method','repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getKeyInjectionDelay()',false,null);return false;"><img class='img_base img_jdt_elcl16_thin_show_toolbar' src='/static/app/images/1x1.gif' border='0' title='More ...' width='11' height='16'></img></a><a name="Configurator.getKeyInjectionDelay%28%29">getKeyInjectionDelay</a>()&nbsp;{</pre></div><div class="line" id="line-222"><div class="lnml" id="lnml-222"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(222);" onmouseout="untriggerLineHotspot(222);"><pre><a name="222" href="#222">222</a></pre></div><div class="lnmr" id="lnmr-222" onmouseover="triggerLineHotspot(222);" onmouseout="untriggerLineHotspot(222);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(222); return false;"><img id="lnhs-222" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kw">return</span>&nbsp;<span class="mark-4#1" onmouseover="scheduleMark(this);" onmouseout="unscheduleMark(this);"><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mKeyInjectionDelay" title="long mKeyInjectionDelay" class="hidden">mKeyInjectionDelay</a></span>;</pre></div><div class="line" id="line-223"><div class="lnml" id="lnml-223"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(223);" onmouseout="untriggerLineHotspot(223);"><pre><a name="223" href="#223">223</a></pre></div><div class="lnmr" id="lnmr-223" onmouseover="triggerLineHotspot(223);" onmouseout="untriggerLineHotspot(223);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(223); return false;"><img id="lnhs-223" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>&nbsp;&nbsp;&nbsp;&nbsp;}</pre></div><div class="line" id="line-224"><div class="lnml" id="lnml-224"><img src="/static/app/images/1x1.gif" width="16" height="16"></img></div><div name="ln" class="ln" onmouseover="triggerLineHotspot(224);" onmouseout="untriggerLineHotspot(224);"><pre><a name="224" href="#224">224</a></pre></div><div class="lnmr" id="lnmr-224" onmouseover="triggerLineHotspot(224);" onmouseout="untriggerLineHotspot(224);"><a title='Generate HTML widget' href='#' onclick="showSnippetDialog(224); return false;"><img id="lnhs-224" src="/static/app/images/1x1.gif" width="16" height="16"></img></a></div><pre>}<br/><a name="224"></a></pre></div>
</div>
</div>
</div>
                <div id='entity-decl-context-menu' class='context-menu-panel' style='visibility: hidden;'></div>
                <div id='entity-decl-context-menu-data' style='visibility: hidden;'></div>

                <div id="bug-popup-div" class="bug-popup" style="visibility: hidden;">
                    <span id="bug-message-span"></span>
                </div>

                
                
                <div id="ad-container">
                    <script>
                    function findPre(el) {
                        var children = el.childNodes;
                        for(var i = 0; i < children.length; ++i) {
                            var c = children[i];
                            if (c.tagName == "PRE") {
                                return c;
                            }
                        }
                        return null;
                    }

                    function getLines() {
                        if (document.getElementsByClassName) {
                        	return document.getElementsByClassName("line");
                        } else {
                            var lines = new Array();
                            divs = document.getElementsByTagName("div");
                            for(var i = 0; i < divs.length; ++i) {
                                if (divs[i].className == "line") {
                                    lines[lines.length] = divs[i];
                                }
                            }
                            return lines;
                        }
                    }

                    function findContigousAdSpace() {
                        var lineElems = getLines();
                        var regions = new Array();
                        var inRegion = false;
                        var lastLine = -1;
                        var currRegion = null;
                        for(var i = 0; i < lineElems.length; ++i) {
                            var d = lineElems[i];
                            var did = d.id;
                            if (!did || !did.substr(0, 5) == "line-") {
                                continue;
                            }
                            var line = parseInt(did.substr(5));
                            var pre = findPre(d);
                            if (lastLine + 1 == line) {
                                if (pre) {
                                    currRegion.xEnd = currRegion.xEnd < pre.offsetWidth ? pre.offsetWidth : currRegion.xEnd;
                                    currRegion.yEnd = getPageOffsetBottom(pre) - getPageOffsetTop(document.getElementById('source-view'));
                                }
                            } else {
                                if (currRegion) {
                                    regions[regions.length] = currRegion;
                                }
                                if (pre) {
                                    currRegion = { };
                                    currRegion.xEnd = pre.offsetWidth;
                                    currRegion.yBegin = getPageOffsetTop(pre) - getPageOffsetTop(document.getElementById('source-view'));
                                }
                            }
                            lastLine = line;
                        }
                        if (currRegion) {
                            regions[regions.length] = currRegion;
                        }
                        return regions;
                    }

                    function show160x600Ad(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 600 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 185px; height: 610px"><div style="position: relative;">'
                                    + get160x600Ad()
                                    + '</div></div>');
                            region.yBegin = j + 600;
                            return true;
                        }
                        return false;
                    }
                    
                    function show120x240Ad(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 240 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 145px; height: 250px"><div style="position: relative;">'
                                    + get120x240Ad()
                                    + '</div></div>');
                            region.yBegin = j + 240;
                            return true;
                        }
                        return false;
                    }

                    function show160x90LinkUnitAd(divWidth, region) {
                        var j = region.yBegin + 20;
                        if (j + 90 < region.yEnd) {
                            if (region.xEnd > divWidth - 200) {
                                return false;
                            }
                            document.write('<div style="position: absolute; right: 0px; top: ' + j + 'px; z-index: 2; width: 185px; height: 100px"><div style="position: relative;">'
                                    + get160x90LinkUnitAd()
                                    + '</div></div>');
                            region.yBegin = j + 90;
                            return true;
                        }
                        return false;
                    }

                    function showAds() {
                        var units = [[ show160x600Ad, show120x240Ad ], [ show160x90LinkUnitAd ]]
                        var regions = findContigousAdSpace();
                        var num = 0;
                        var divWidth = getPageOffsetRight(document.getElementById('source-view')) - getPageOffsetLeft(document.getElementById('source-view'));
                        for(var unit = 0; unit < units.length; ++unit) {
                            var ads = units[unit];
                            var num = 0;
                            var maxNAds = 3;
                            for(var a = 0; a < ads.length; ++a) {
                                if (num >= maxNAds) {
                                    break;
                                }
                                for(var i = 0; i < regions.length; ++i) {
                                    if (num >= maxNAds) {
                                        break;
                                    }
                                    while(true) {
                                        if (num >= maxNAds) {
                                            break;
                                        }
                                        if (!ads[a](divWidth, regions[i])) {
                                            break;
                                        }
                                        ++num;
                                    }
                                }
                            }
                        }
                    }
                    if (!isBrowserMSIE()) {
                        showAds();
                    }
                    </script>
                </div>
                
            </div>
        </div>
    </div>
    <div style="display: none;" id="outline-view-div">
        <div class="outline-header">
            <form name="profileform">
            <label for="profile">Profile: </label>
            <select name="profile" onchange="setProfile(this.value);" id="profilechanger">
                <option value="jre">Standard JRE</option>
                <option value="gae">Google AppEngine</option>
            </select>
            </form>
        </div>
        <div><div class='outline'>
<img class='img_base img_jdt_obj16_package_obj' src='/static/app/images/1x1.gif' border='0' title='Package' width='16' height='16'></img>&nbsp;<span class="code">com.android.uiautomator.core</span><br/>
<img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><img class='img_base img_jdt_ovr16_final_co' src='/static/app/images/1x1.gif' border='0' title='Final' width='7' height='7'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:3px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator" title="public final class Configurator"><span class="code">Configurator</span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator"></div><br/>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_private_co' src='/static/app/images/1x1.gif' border='0' title='Private Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_constr_ovr' src='/static/app/images/1x1.gif' border='0' title='Constructor' width='7' height='8'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.%3Cinit%3E%28%29" title="private void Configurator()"><span class="code">Configurator()<span class="returnType"> : void</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@<init>()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getActionAcknowledgmentTimeout%28%29" title="public long getActionAcknowledgmentTimeout()"><span class="code">getActionAcknowledgmentTimeout()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getActionAcknowledgmentTimeout()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_static_co' src='/static/app/images/1x1.gif' border='0' title='Static' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getInstance%28%29" title="public static Configurator getInstance()"><span class="code">getInstance()<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getInstance()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getKeyInjectionDelay%28%29" title="public long getKeyInjectionDelay()"><span class="code">getKeyInjectionDelay()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getKeyInjectionDelay()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getScrollAcknowledgmentTimeout%28%29" title="public long getScrollAcknowledgmentTimeout()"><span class="code">getScrollAcknowledgmentTimeout()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getScrollAcknowledgmentTimeout()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getWaitForIdleTimeout%28%29" title="public long getWaitForIdleTimeout()"><span class="code">getWaitForIdleTimeout()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForIdleTimeout()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.getWaitForSelectorTimeout%28%29" title="public long getWaitForSelectorTimeout()"><span class="code">getWaitForSelectorTimeout()<span class="returnType"> : long</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForSelectorTimeout()"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setActionAcknowledgmentTimeout%28long%29" title="public Configurator setActionAcknowledgmentTimeout(long)"><span class="code">setActionAcknowledgmentTimeout(long)<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setActionAcknowledgmentTimeout(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setKeyInjectionDelay%28long%29" title="public Configurator setKeyInjectionDelay(long)"><span class="code">setKeyInjectionDelay(long)<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setKeyInjectionDelay(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setScrollAcknowledgmentTimeout%28long%29" title="public Configurator setScrollAcknowledgmentTimeout(long)"><span class="code">setScrollAcknowledgmentTimeout(long)<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setScrollAcknowledgmentTimeout(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setWaitForIdleTimeout%28long%29" title="public Configurator setWaitForIdleTimeout(long)"><span class="code">setWaitForIdleTimeout(long)<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForIdleTimeout(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_elcl16_public_co' src='/static/app/images/1x1.gif' border='0' title='Public Method' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.setWaitForSelectorTimeout%28long%29" title="public Configurator setWaitForSelectorTimeout(long)"><span class="code">setWaitForSelectorTimeout(long)<span class="returnType"> : Configurator</span></span></a><div class="gae-status" id="gae-status-repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForSelectorTimeout(long)"></div><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mKeyInjectionDelay" title="private long mKeyInjectionDelay"><span class="code">mKeyInjectionDelay : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mScrollEventWaitTimeout" title="private long mScrollEventWaitTimeout"><span class="code">mScrollEventWaitTimeout : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForActionAcknowledgment" title="private long mWaitForActionAcknowledgment"><span class="code">mWaitForActionAcknowledgment : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForIdleTimeout" title="private long mWaitForIdleTimeout"><span class="code">mWaitForIdleTimeout : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 16px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0mWaitForSelector" title="private long mWaitForSelector"><span class="code">mWaitForSelector : <span class="returnType">long</span></span></a><br/></nobr>
<nobr><img class='img_base img_transparent_16_16' src='/static/app/images/1x1.gif' border='0' width='16' height='16'></img><img class='img_base img_jdt_obj16_field_private_obj' src='/static/app/images/1x1.gif' border='0' title='Private Field' width='16' height='16'></img><sup><img class='img_base img_jdt_ovr16_static_co' src='/static/app/images/1x1.gif' border='0' title='Static' width='7' height='7'></img></sup><img class='img_base img_transparent_1_16' src='/static/app/images/1x1.gif' border='0' style='padding:0px 0px 0px 3px;' width='16' height='16'></img><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java#Configurator.0sConfigurator" title="private static Configurator sConfigurator"><span class="code">sConfigurator : <span class="returnType">Configurator</span></span></a><br/></nobr>
</div>
</div>
    </div>
    <div style="display: none;" id="th-view-div">
        <div><div class="type-hierarchy">
<img class='img_base img_jdt_ovr16_focus_ovr' src='/static/app/images/1x1.gif' border='0' title='Focus' width='4' height='10'></img><img class='img_base img_jdt_obj16_class_obj' src='/static/app/images/1x1.gif' border='0' title='Class' width='16' height='16'></img><span class='whitespace'>.</span><b><a href="/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.4_r1/com/android/uiautomator/core/Configurator.java?av=h#Configurator" title="in GrepCode / com.google.android / android / 4.4.4_r1"><span class="code">Configurator</span></a></b><br/>
</div>
</div>
    </div>
    <script type="text/javascript">pageTracker._setCustomVar(1, 'p-uri', 'http://source.android.com', 3);</script>
    <script>
    function render(msgPre, evidenceId, currentId) {
        var currentParts = currentId.split("@");
        if (evidenceId == "") {
            return currentParts.length == 5 ? (msgPre + " as indicated by Google AppEngine Whitelist") : "";
        }
        var parts = evidenceId.split("@");
        if (parts.length == 5) {
            var prefix = "Uses";
            if (currentParts[3] == parts[3] && (currentParts[4] + ".").substring(0, parts[4].length + 1) == (parts[4] + ".")) {
                prefix = "Contained in";
            }
            return prefix + " type " + (parts[3] + "." + parts[4]).replace(/\$/g, ".");
        } else if (parts.length == 6) {
            return "Uses method " + parts[5] + " in type " + (parts[3] + "." + parts[4]).replace("$", ".");            
        }
        return "";
    }
    
    function doProfileRegistration(event, dummy, data) {
        var gaepc = data[0];

        for(i = 0; i < gaepc[2].length; ++i) {
            var m = gaepc[2][i];
            if (m.length >= 3) {
                var div = document.getElementById("gae-status-" + m[0]);
                if (div) {
                    if ("NONE" == m[1]) {
                        div.innerHTML = "<img class='img_base img_jdt_obj16_never_translate' src='/static/app/images/1x1.gif' border='0' title='"+ render("No support", m[2], m[0]) + "' width='16' height='16'></img>";
                    } else if ("PARTIAL" == m[1]) {
                        div.innerHTML = "<img class='img_base img_jdt_obj16_warning_obj' src='/static/app/images/1x1.gif' border='0' title='"+ render("Partial support", m[2], m[0]) + "' width='16' height='16'></img>";
                    }
                }
            }
        }
    }

    function registerProfileCompatibility(data) {
        YAHOO.util.Event.onDOMReady(doProfileRegistration, data);
    }

    function setInitialProfile() {
        var profileId = getRequestParameter('pr');
        var profileChooser = document.getElementById("profilechanger");

        if (profileChooser != null) {
            var options = profileChooser.options;
            for (var i=0; i<options.length; i=i+1) {
                if (options[i].value == profileId) {
                    options[i].selected = true;
                    setProfile(profileId);
                    return;
                }
            }
        }
    }

    function setProfile(value) {
        if ("gae" == value) {
            var el = YAHOO.util.Dom.getElementsByClassName("gae-status");            
            YAHOO.util.Dom.replaceClass(el, "gae-status", "gae-status-enabled");            
        } else {
            el = YAHOO.util.Dom.getElementsByClassName("gae-status-enabled");
            YAHOO.util.Dom.replaceClass(el, "gae-status-enabled", "gae-status");            
        }
    }

    var markElement = null;
    var scheduledMarkId = null;

    function scheduleMark(el) {
        if (scheduledMarkId != null) {
            unscheduleMark(null)
        }
        markElement = el;
        scheduledMarkId = setInterval("mark(markElement);", 500);
    }

    function unscheduleMark(el) {
        if (scheduledMarkId != null) {
            clearInterval(scheduledMarkId);
            scheduledMarkId = null;
        }
    }

    function mark(el) {
        var classAttribute = getClassAttribute(el);
        var weight = getWeight(classAttribute);
        if (weight == "0") {
            el.style.background = "#fb8";
        }
        else {
            el.style.background = "#ddd";
        }
    
        var markWithoutWeight = removeWeight(classAttribute);
    
        var spanElems = document.getElementsByTagName("span");
        for (i = 0; i < spanElems.length; i++) {        
            var spanClassAttribute = getClassAttribute(spanElems[i]);
            if (spanClassAttribute && isMark(spanClassAttribute)) {
                if (markWithoutWeight == removeWeight(spanClassAttribute)) {            
                    var spanWeight = getWeight(spanClassAttribute);
                    if (spanWeight == "0") {
                        spanElems[i].style.background = "#fb8";
                    }
                    else {
                        spanElems[i].style.background = "#ddd";
                    }
                }
                else {
                    spanElems[i].style.background = "";
                }       
            }   
        }    
    }

    function demark(el) {
        el.style.background = "white";
        var spanElems = document.getElementsByTagName("span");
        for (i = 0; i < spanElems.length; i++) {
            if (getClassAttribute(el) == getClassAttribute(spanElems[i])) {
                spanElems[i].style.background = ""; 
            }
        }
    }

    function removeWeight(s) {
        return s.substring(0, s.indexOf('#'));
    }

    function getWeight(s) {
        return s.substring(s.indexOf('#')+1);
    }

    function isMark(s) {
        return (s.length > 5) && (s.substring(0, 5) == "mark-");
    }
    </script>
    <div style="display: none;" id="pc-div">
        <div><script language="javascript">registerProfileCompatibility([["gae","Google AppEngine",[["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@<init>()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getActionAcknowledgmentTimeout()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getInstance()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getKeyInjectionDelay()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getScrollAcknowledgmentTimeout()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForIdleTimeout()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@getWaitForSelectorTimeout()","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setActionAcknowledgmentTimeout(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setKeyInjectionDelay(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setScrollAcknowledgmentTimeout(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForIdleTimeout(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator@setWaitForSelectorTimeout(long)","NONE",""],["repository.grepcode.com$java$ext@com.google.android$android@4.4.4_r1@com$android$uiautomator$core@Configurator","NONE","!1j@!1l@!k1@com$android$uiautomator$core@UiDevice"],[]]]])</script></div>
    </div>

    <script>
    var bugPopUpOn = -1;
    var bugs = [];

    function showbug(marker, index) {
        var bugPopupDiv = document.getElementById('bug-popup-div');
        var bugMsgSpan = document.getElementById('bug-message-span');
        var startIndex = index - 1;
        while(startIndex >= 0 && bugs[startIndex].sl == bugs[index].sl) {
            --startIndex;
        }
        ++startIndex;
        var str = '';
        for(var i = startIndex; i <= index; ++i) {
            var bug = bugs[i];
            if (bug.el > 0 && bug.el != bug.sl) {
                str += 'Lines ' + bug.sl + '-' + bug.el;
            } else {
                str += 'Line ' + bug.sl;
            }
            str += ': ' + bug.m + '<br/>';
        }
        bugMsgSpan.innerHTML = str;
        bugPopupDiv.style.left = (marker.offsetLeft + 20) + 'px';
        bugPopupDiv.style.top = (marker.offsetTop + 20) + 'px';
        bugPopupDiv.style.visibility = 'visible';        
    }

    function hidebug() {
        var bugPopupDiv = document.getElementById('bug-popup-div');
        bugPopupDiv.style.visibility = 'hidden';
    }

    function cmpBugs(b1, b2) {
        return b1.sl - b2.sl;
    }

    function showBugs() {
        bugs = eval(document.getElementById('bugs').innerHTML).sort(cmpBugs);
        for (var i=0, ln=bugs.length; i<ln; ++i) {
            var lnm = findBugLnm(i);
            if (lnm) {
                var nextBug = findNextBugWithLnm(i);
                var nextBugHref = nextBug ? "#" + nextBug.sl : "#";
                lnm.innerHTML = 
                    "<a href=\""+nextBugHref+"\" onmouseover=\"showbug(this,"+i+");\" onmouseout=\"hidebug();\">"+
                    "<img width=\"16\" height=\"16\" src=\"/static/app/images/debug_persp.gif\" style=\"border-style: none;\"></img>"+
                    "</a>";
            }
        }
    }
    YAHOO.util.Event.onDOMReady(showBugs, null, true);

    function findBugLnm(bugIdx) {
        var bug = bugs[bugIdx];
        if (bug.sl > 0) {
            var lnm = document.getElementById('lnml-' + bug.sl);
            if (lnm) {
                return lnm;
            }
        }
        return null;
    }

    function findNextBugWithLnm(bugIdx) {
        var sl = bugs[bugIdx].sl;
        for (var i = bugIdx+1, ln=bugs.length; i<ln; i++) {
            if (bugs[i].sl > sl) {
                var lnm = findBugLnm(i);
                if (lnm) {
                    return bugs[i];
                }
            }
        }
        return null;
    }
    
    function triggerLineHotspot(line) {
        var imgTag = document.getElementById('lnhs-' + line);
        if (imgTag) {
            imgTag.src = '/static/app/images/html_tag_obj.gif';
        }
    }

    function untriggerLineHotspot(line) {
        var imgTag = document.getElementById('lnhs-' + line);
        if (imgTag) {
            imgTag.src = '/static/app/images/1x1.gif';
        }
    }
    
    function showStackOverflowQuestions() {
        document.getElementById('page-mask').style.visibility = 'visible';
        var dropdown = document.getElementById('so-question-panel');
        if (dropdown) {
            dropdown.style.display = 'block';
            var x = (getWindowWidth() - dropdown.offsetWidth) / 2;
            var y = (getWindowHeight() - dropdown.offsetHeight) / 2;
            dropdown.style.left = x + 'px';
            dropdown.style.top = y + 'px';
            dropdown.style.visibility = 'visible';
        }
    }

    function hideStackOverflowQuestions() {
        var dropdown = document.getElementById('so-question-panel');
        if (dropdown) {
            dropdown.style.visibility = 'hidden';
            dropdown.style.display = 'none';
        }
        document.getElementById('page-mask').style.visibility = 'hidden';
    }

    function showSnippetDialog(line) {
        showSnippetDialogFromTo(line, line);
    }

    function showSnippetDialogFromTo(from, to) {
        document.getElementById('page-mask').style.visibility = 'visible';
        var dropdown = document.getElementById('snippet-dropdown');
        dropdown.style.display = 'block';
        var x = (getWindowWidth() - dropdown.offsetWidth) / 2;
        var y = (getWindowHeight() - dropdown.offsetHeight) / 2;
        dropdown.style.left = x + 'px';
        dropdown.style.top = y + 'px';
        dropdown.style.visibility = 'visible';
        var form = document.getElementById('snippet-form');
        form.snippet_start.value = from;
        form.snippet_end.value = to;
        fetchSnippet();
    }

    function hideSnippetDialog() {
        var dropdown = document.getElementById('snippet-dropdown');
        dropdown.style.visibility = 'hidden';
        dropdown.style.display = 'none';
        document.getElementById('page-mask').style.visibility = 'hidden';
    }
    
    function escKeyListener() {
        hideSnippetDialog();
        hideStackOverflowQuestions();
    }

    keyListener = new YAHOO.util.KeyListener(document, {keys:[27]}, escKeyListener);
    YAHOO.util.Event.onDOMReady(keyListener.enable, keyListener, true);
        
    
    function incFromLine() {
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        form.snippet_start.value = startNum + 1
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        if (endNum < startNum + 1) {
            form.snippet_end.value = form.snippet_start.value;
        }
        fetchSnippet();
    }

    function decFromLine() {
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        form.snippet_start.value = startNum <= 1 ? 1 : (startNum - 1);
        fetchSnippet();
    }

    function incToLine() {
        var form = document.getElementById('snippet-form');
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        form.snippet_end.value = endNum + 1;
        fetchSnippet();
    }

    function decToLine() {
        var form = document.getElementById('snippet-form');
        var end = form.snippet_end.value;
        var endNum = parseInt(end);
        form.snippet_end.value = endNum <= 1 ? 1 : (endNum - 1);
        var start = form.snippet_start.value;
        var startNum = parseInt(start);
        if (endNum - 1 < startNum) {
            form.snippet_start.value = form.snippet_end.value;
        }
        fetchSnippet();
    }

    function fetchSnippet() {
        var preview = document.getElementById('snippet-preview');
        var form = document.getElementById('snippet-form');
        var start = form.snippet_start.value;
        var end = form.snippet_end.value;
        var startNum = parseInt(start);
        var endNum = parseInt(end);
        var length = endNum - startNum + 1;

        var sUrl = location.protocol+"//"+location.host+location.pathname+
                   "?fragment=line&start="+start+"&length="+length;

        var callback = {
            success: function(oResponse) {
                var snippet = oResponse.responseText;
                preview.innerHTML = snippet;
                form.snippet_html.value = snippet;
                form.snippet_html.select();
                form.snippet_html.focus();
            },

            failure: function(oResponse) {
                preview.innerHTML = "";
                form.snippet_html.value = "";
            },

            timeout: 7000
        };

        YAHOO.util.Connect.asyncRequest('GET', sUrl, callback);
    }

    fileSource = function() {
    	var leftTabView;

    	function getOutlineHTML() {
        	var outlineDiv = document.getElementById("outline-view-div");
        	var html = outlineDiv.innerHTML;
        	outlineDiv.innerHTML = "";
        	return html;
    	}

        function addTabs() {
            var allviews = document.getElementById('allviews_hidden').innerHTML;
            var activeview = document.getElementById('activeview_hidden').innerHTML;

            leftTabView = new YAHOO.widget.TabView();

            if (allviews.indexOf('o') >= 0) {
                leftTabView.addTab( new YAHOO.widget.Tab({
                    label: 'Outline',
                    content: getOutlineHTML(),
                    cacheData: true,
                    active: activeview == 'o'
                }));
            }

            leftTabView.addTab( new YAHOO.widget.Tab({
                label: 'Files',
                content: '<div class="file-nav-tree-container"><div id="treeDiv"></div></div>',
                cacheData: true,
                active: activeview == 'f'
            }));

            if (allviews.indexOf('h') >=0 ) {
                leftTabView.addTab( new YAHOO.widget.Tab({
                    label: 'Hierarchy',
                    content: document.getElementById("th-view-div").innerHTML,
                    cacheData: true,
                    active: activeview == 'h'
                }));
            }
         
            if (!isGCEnterpriseEdition() && !isBrowserMSIE7() && !isBrowserMSIE6()) {   
                var commentURL = window.location.protocol + "//grepcode.com" + window.location.pathname;
            
                leftTabView.addTab(new YAHOO.widget.Tab({
                    label: 'Comments',
                    content: '<div class="fb-comments" data-href=' + commentURL + ' data-num-posts="20" data-width="380"></div>',
                    cacheData: false,
                    active: false
                }));
            }

            if (bugs.length > 0) {
                var links = "<ul class='bug-list'>";
                for(var i = 0; i < bugs.length; ++i) {
                    var bug = bugs[i];
                    var str = bug.m;
                    if (bug.sl > 0) {
                        var lnm = document.getElementById('lnml-' + bug.sl);
                        if (lnm) {
                            str = '<div class="bug-message">'+
                                    '<div class="ln"><a href="#' + bug.sl + '">' + bug.sl + '</a></div>'+': '+str+
                                  '</div>';
                        }
                    }
                    links += "<li class='bug-item'><span>" + str + "</span></li>";
                }
                links += "</ul>";
                var bugsTab = new YAHOO.widget.Tab({
                    label: 'Bugs (' + bugs.length + ')',
                    content: links,
                    active: activeview == 'b'
                });

                bugsTab.addListener('click', function(e) {
                    for (var i=0, ln=bugs.length; i<ln; ++i) {
                        var lnm = findBugLnm(i);
                        if (lnm) {
                            var ch = lnm.childNodes[0];
                            ch.focus();
                            break;
                        }
                    }
                });

                leftTabView.addTab(bugsTab);
            }

            leftTabView.appendTo('file-nav-tabs');
        }
    
        return {
            init: function() {
                addTabs();
                setInitialProfile();
            }
        };
    }();

    YAHOO.util.Event.onDOMReady(fileSource.init, fileSource, true);
    
    YAHOO.util.Event.onDOMReady(projectTree.init, projectTree, true);
    
    function setDimensions() {
        var fNavDiv = document.getElementById('file-nav-panel');
        var fSrcDiv = document.getElementById('source-view');

        fNavDiv.style.height = (getWindowHeight() - getPageOffsetTop(fNavDiv) - 1) + 'px';

        fSrcDiv.style.left = getPageOffsetRight(fNavDiv) + 'px';
        fSrcDiv.style.bottom = '0px';
        fSrcDiv.style.right = '0px';
        fSrcDiv.style.width = (getWindowWidth() - getPageOffsetRight(fNavDiv) - 1) + 'px';
        fSrcDiv.style.height = (getWindowHeight() - getPageOffsetTop(fNavDiv) - 1) + 'px';
    }

    YAHOO.util.Event.onDOMReady(setDimensions, null, true);
    YAHOO.util.Event.on(window, 'resize', setDimensions);

    function highlightLine(line) {
        var lDiv = document.getElementById('line-' + line);
        if (lDiv) {
            lDiv.style.background = '#e0e0ff';
        }
    }

    function highlightCurrentLine() {
        var anchor = window.location.hash;
        if (anchor) {
            anchor = anchor.substring(1);
            var line = parseInt(anchor);
            if (!isNaN(line)) {
                highlightLine(line);
            }
        }
    }
    </script>
</div>



    
        <div id="fb-root"></div>
        <img id="comment-ping-back" src="/static/app/images/1x1.gif"/>
        <script>
            window.fbAsyncInit = function() {
                FB.init({
                    appId:  '143989634057',
                    status: true,
                    cookie: true,
                    xfbml:  true
                });

                FB.Event.subscribe('comment.create', function(response) {
                    document.getElementById('comment-ping-back').src = "/event?type=comment.create&url=" + window.location + "&href=" + response.href + "&commentID=" + response.commentID;
                });
            };

            (function(d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id)) {return;}
                js = d.createElement(s); js.id = id;
                js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
        </script>
    
    
</div>


    </div>
    <script>
        YAHOO.util.Event.onDOMReady(function() {
            var html = document.getElementById('html');
            html.style.overflow = "hidden";
        }, null, true);
    </script>


        
        
            <div id="notification-bar">
                <table width="100%" border="0">
                    <tr valign="middle">
                        <td valign="middle"><span class="message">New to GrepCode? Check out our <a href="/faq" onclick="disableNotification(); return true;">FAQ</a></span></td>
                        <td valign="middle"><span class="cancel"><a href="#" onclick="disableNotification(); return false;">X</a></span></td>
                    </tr>
                </table>
            </div>
            <script type="text/javascript">
                YAHOO.util.Event.onDOMReady(doNotification);
            </script>
        
        
        

        

        

        
        
            <script type="text/javascript">
            try {
                pageTracker._trackPageview();
            } catch(err) {
            }
            </script>
        

        
        
            <!-- Google +1 -->
            <script type="text/javascript">
              (function() {
                var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
                po.src = 'https://apis.google.com/js/plusone.js';
                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
              })();
            </script>
        

        
    </body>
</html>
