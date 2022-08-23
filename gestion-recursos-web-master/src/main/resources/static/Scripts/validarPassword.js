(function (e, t, n, r) {
    function o(t, n) {
        this.element = t;
        this.$elem = e(this.element);
        this.options = e.extend({}, s, n);

        this._defaults = s;
        this._name = i;
        this.init()
    }

    var i = "strength", s = {
        strengthClass: "strength",
        strengthMeterClass: "strength_meter",
        strengthButtonClass: "button_strength",
        strengthButtonText: "Mostrar Password",
        strengthButtonTextToggle: "Ocultar Password"
    };
    o.prototype = {
        init: function () {
            function c(e, t) {
                return t / e * 100
            }

            function h(e, n) {
                if (e.length > 8) {
                    t = 1
                } else {
                    t = 0
                }
                if (e.match(u)) {
                    r = 1
                } else {
                    r = 0
                }
                if (e.match(a)) {
                    i = 1
                } else {
                    i = 0
                }
                if (e.match(f)) {
                    s = 1
                } else {
                    s = 0
                }
                var l = t + r + i + s + o;
                var h = c(7, l).toFixed(0);

                p(l, n)
            }

            function p(t, n) {
                var r = e('div[data-meter="' + n + '"]');
                if (t <= 1) {
                    r.removeClass();
                    r.addClass("veryweak").html("No segura")
                } else if (t == 2) {
                    r.removeClass();

                    r.addClass("weak").html("Debil")
                } else if (t == 3) {
                    r.removeClass();
                    r.addClass("medium").html("Medio")
                } else {
                    r.removeClass();
                    r.addClass("strong").html("Seguro")
                }
            }

            var t = 0;
            var r = 0;
            var i = 0;
            var s = 0;
            var o = 0;
            var u = new RegExp("[A-Z]");
            var a = new RegExp("[a-z]");
            var f = new RegExp("[0-9]");
            var l = new RegExp("([!,%,&,@,#,$,^,*,?,_,~])");

            var d = false;
            var v = this.options.strengthButtonText;
            var m = this.options.strengthButtonTextToggle;
            thisid = this.$elem.attr("id");
            this.$elem.addClass(this.options.strengthClass).attr("data-password", thisid).after('<input style="display:none" class="' + this.options.strengthClass + '" data-password="' + thisid + '" type="text" name="" value=""><a data-password-button="' + thisid + '" href="" class="' + this.options.strengthButtonClass + '">' + this.options.strengthButtonText + '</a><div class="' + this.options.strengthMeterClass + '"><div data-meter="' + thisid + '"></div></div>');
            this.$elem.bind("keyup keydown", function (t) {
                thisval = e("#" + thisid).val();

                e('input[type="text"][data-password="' + thisid + '"]').val(thisval);
                h(thisval, thisid)
            });

            e('input[type="text"][data-password="' + thisid + '"]').bind("keyup keydown", function (t) {
                thisval = e('input[type="text"][data-password="' + thisid + '"]').val();
                console.log(thisval);
                e('input[type="password"][data-password="' + thisid + '"]').val(thisval);
                h(thisval, thisid)
            });

            e(n.body).on("click", "." + this.options.strengthButtonClass, function (t) {
                t.preventDefault();
                thisclass = "hide_" + e(this).attr("class");
                if (d) {
                    e('input[type="text"][data-password="' + thisid + '"]').hide();
                    e('input[type="password"][data-password="' + thisid + '"]').show().focus();
                    e('a[data-password-button="' + thisid + '"]').removeClass(thisclass).html(v);
                    d = false
                } else {
                    e('input[type="text"][data-password="' + thisid + '"]').show().focus();
                    e('input[type="password"][data-password="' + thisid + '"]').hide();
                    e('a[data-password-button="' + thisid + '"]').addClass(thisclass).html(m);
                    d = true
                }
            })
        }, yourOtherFunction: function (e, t) {
        }
    };
    e.fn[i] = function (t) {
        return this.each(function () {
            if (!e.data(this, "plugin_" + i)) {
                e.data(this, "plugin_" + i, new o(this, t))
            }
        })
    }
})(jQuery, window, document)