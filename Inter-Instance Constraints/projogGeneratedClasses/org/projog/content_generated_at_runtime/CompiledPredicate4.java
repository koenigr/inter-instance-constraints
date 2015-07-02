package org.projog.content_generated_at_runtime;
import org.projog.core.udp.compiler.*;
import org.projog.core.udp.interpreter.*;
import org.projog.core.udp.*;
import org.projog.core.term.*;
import org.projog.core.*;
import static org.projog.core.term.NumericTermComparator.NUMERIC_TERM_COMPARATOR;
// testRun/1
public final class CompiledPredicate4 implements CompiledPredicate {
   private final boolean initRule0() {
      v0_X = a0;
      return true;
   }
   private final boolean retryRule0() {
      do {
         mainloop:
         switch (conjunctionCtr) {
            case 0:
            if (e0==null) {
               t0 = v0_X.getTerm();
               e0 = DynamicUserDefinedPredicateFactory_1.getPredicate(t0);
            } else {
               if (e0.isRetryable()==false) {
                  return false;
               }
               v0_X = _0;
            }
            if (!e0.evaluate(t0)) {
               e0 = null;
               return false;
            }
            _0 = v0_X;
            v0_X = v0_X.getTerm();
            return true;
         }
      } while (true);
   }
   public CompiledPredicate4(final KnowledgeBase _kb) {
      s = KnowledgeBaseUtils.getSpyPoints(_kb).getSpyPoint(new PredicateKey("testRun", 1));
      d = false;
      DynamicUserDefinedPredicateFactory_1 = (org.projog.core.udp.DynamicUserDefinedPredicateFactory)_kb.getPredicateFactory(new PredicateKey("test", 1));
   }
   CompiledPredicate4(final Term in0) {
      a0 = in0.getTerm();
      d = s.isEnabled();
   }
   private final void backtrack() {
      a0.backtrack();
   }
   public final boolean evaluate(final Term... args) {
      if (d) {
         if (clauseCtr==0 && !isRetrying) {
            if (d) {
               s.logCall(this, new Term[]{a0});
            }
         } else {
            if (d) {
               s.logRedo(this, new Term[]{a0});
            }
         }
      }
      if (isRetrying) {
         if (retryRule0()) {
            if (d) {
               s.logExit(this, new Term[]{a0});
            }
            return true;
         }
         isRetrying = false;
      } else {
         if (initRule0() && retryRule0()) {
            isRetrying = true;
            if (d) {
               s.logExit(this, new Term[]{a0});
            }
            return true;
         }
      }
      // Fail 1
      if (d) {
         s.logFail(this, new Term[]{a0});
      }
      return false;
   }
   public final boolean isRetryable() {
      return true;
   }
   public final boolean couldReEvaluationSucceed() {
      if (e0!=null && e0.couldReEvaluationSucceed()) {
         return true;
      }
      return false;
   }
   public final void setKnowledgeBase(KnowledgeBase kb) {
      throw new RuntimeException();
   }
   public final Predicate getPredicate(final Term... termArgs) {
      return new CompiledPredicate4(termArgs[0]);
   }
   private static org.projog.core.udp.DynamicUserDefinedPredicateFactory DynamicUserDefinedPredicateFactory_1;
   private static SpyPoints.SpyPoint s;
   private final boolean d;
   private boolean isRetrying;
   private int clauseCtr;
   private int conjunctionCtr;
   private Term a0;
   private org.projog.core.Predicate e0;
   private Term v0_X;
   private Term t0;
   private Term _0;
}
